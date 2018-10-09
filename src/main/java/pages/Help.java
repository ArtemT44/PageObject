package pages;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Help {

    WebDriver driver;

    public Help(WebDriver driver) {
        this.driver=driver;
    }

    public String getbrowser() {
        Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
        return cap.getBrowserName().toLowerCase();
    }


    public void createAndWriteFile(List<String> item, String searchPageTitle){
        String fileName = getbrowser();
        String time = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date());
        try{
            String path="./src/test/file/" + time + fileName + searchPageTitle + ".txt";
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            for (String str : item)
            {
                bw.write(str);
                bw.newLine();
            }
            bw.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
