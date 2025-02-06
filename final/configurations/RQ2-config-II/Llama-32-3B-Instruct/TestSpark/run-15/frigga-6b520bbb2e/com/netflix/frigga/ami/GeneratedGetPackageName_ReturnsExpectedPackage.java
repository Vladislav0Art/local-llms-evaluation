package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetPackageName_ReturnsExpectedPackage {

    @Test
    public void getPackageName_ReturnsExpectedPackage() {
        String expectedName = "com.netflix.frigga.ami";
        AppVersion appVersion = new AppVersion();
        assertEquals(expectedName, appVersion.getPackageName());
    }

}