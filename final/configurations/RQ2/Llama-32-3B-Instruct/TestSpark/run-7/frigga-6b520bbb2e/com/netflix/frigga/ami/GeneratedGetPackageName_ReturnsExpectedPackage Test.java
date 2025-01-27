package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetPackageName_ReturnsExpectedPackage Test {

    @Test
    public void getPackageName_ReturnsExpectedPackage

    Test() {
        AppVersion appVersion = new AppVersion("1.0-123456789");
        assertEquals(NameConstants.APP_VERSION_PACKAGE, appVersion.getPackageName());
    }

}