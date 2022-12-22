/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.wolobi.selenium.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author speci
 */
public class SeleniumTesting {

//    public static void main(String[] args) {
//        System.out.println("Iniciando test selenium con chrome driver");
//        jenkinsTest();
//    }
    @Test
    public void jenkinsTest() {
        System.setProperty("webdriver.chrome.driver", "selenium-drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.es/");
        String title = driver.getTitle();
        WebElement buscador = driver.findElement(By.id("twotabsearchtextbox"));
        buscador.click();
        buscador.sendKeys("zapatillas baratas");
        buscador.submit();
        driver.navigate().back();
        driver.quit();
        Assert.assertNotNull(title);
        System.out.println("The page title is: " + title);
//        WebElement buscador2 = driver.findElement(By.id("twoasdtabsgfearchtexsdtbox"));
//        buscador2.click();
    }

}
