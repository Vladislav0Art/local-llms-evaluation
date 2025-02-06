package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

public class GeneratedGetPackageName_AnyValidNameReturnsCorrectPackageName {

    @Test
    public void getPackageName_AnyValidNameReturnsCorrectPackageName() {
        String amiName = "1.0.0-RC2";
        AppVersion appVersion = new AppVersion(amiName);
        assertEquals(NameConstants.AMI_PREFIX + amiName, appVersion.getPackageName());
    }

}