package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.*;

public class JdbConnection {
    public static void main(String[] args) throws SQLException {
        String host = "localhost";
        String port = "3306";

        //demo is the name of database
        Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/demo","root", "root");
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery("select * from credentials where scenario = 'zerobalancecard'");

        while(rs.next())
        {
            WebDriver driver = new ChromeDriver();
            driver.get("https://login.salesforce.com");

            driver.findElement(By.xpath(".//*[@id='username'")).sendKeys(rs.getString("username"));
            driver.findElement(By.xpath(".//*[@id='password'")).sendKeys(rs.getString("password"));
        }
    }
}
