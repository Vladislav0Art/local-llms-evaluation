package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.mockito.Mockito.*;

public class GeneratedGetPackageName_NoPackage_ReturnsEmptyString {

    @Test
    public void getPackageName_NoPackage_ReturnsEmptyString() {
        AppVersion appVersion = new AppVersion("", "");
        assertEquals("", appVersion.getPackageName());
    }

}