package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetPackageName_ValidPackage {

    @Test
    public void getPackageName_ValidPackage() {
        String packageName = NameConstants.NAMES_AMI;
        String amiName = "ami-" + packageName + "-123456789012345678901234567890";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals(packageName, appVersion.getPackageName());
    }

}