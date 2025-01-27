package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.mockito.Mockito;

public class GeneratedGetPackageName_ReturnsCorrectString {

    @Test
    public void getPackageName_ReturnsCorrectString() {
        String packageName = "com.netflix.frigga.ami";
        AppVersion appVersion = new AppVersion();
        assertEquals(packageName, appVersion.getPackageName());
    }

}