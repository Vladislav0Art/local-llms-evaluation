package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetPackageName_ReturnsCorrectPackage {

    @Test
    public void getPackageName_ReturnsCorrectPackage() {
        AppVersion appVersion = new AppVersion("ami-123");
        assertEquals(NameConstants.APP_VERSION_PACKAGE, appVersion.getPackageName());
    }

}