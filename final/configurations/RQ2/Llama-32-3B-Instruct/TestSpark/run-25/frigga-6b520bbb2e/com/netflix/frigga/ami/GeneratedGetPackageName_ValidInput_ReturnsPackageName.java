package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetPackageName_ValidInput_ReturnsPackageName {

    @Test
    public void getPackageName_ValidInput_ReturnsPackageName() {
        AppVersion appVersion = new AppVersion("1.0-1");
        String packageName = appVersion.getPackageName();
        assertEquals(NameConstants.APP_VERSION, packageName);
    }

}