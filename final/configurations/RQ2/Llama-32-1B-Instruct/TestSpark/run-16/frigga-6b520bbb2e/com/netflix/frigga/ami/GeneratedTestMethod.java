package com.netflix.frigga.ami;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestMethod {

    private String appName;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }
}

class TestClass {

    @Test
    public void testMethod() {
        GeneratedTest generatedTest = new GeneratedTest();
        System.out.println(generatedTest.getAppName());
    }
}

public class Main {
    public static void main(String[] args) {
        TestClass testInstance = new TestClass();

        testInstance.testMethod();
    }

}