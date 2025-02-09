package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetPackageNameValidFormatTest {

    @Test
    public void getPackageNameValidFormatTest() {
        AppVersion appVersion = new AppVersion("test", "1.0");
        assertEquals("test", appVersion.getPackageName());
    }

}