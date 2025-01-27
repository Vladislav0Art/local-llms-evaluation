package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedCompareTo_AppVersionGreaterThan {

    @Test
    public void compareTo_AppVersionGreaterThan() {
        String amiName1 = "ami-0c123456789012345678901234567890";
        AppVersion appVersion1 = AppVersion.parseName(amiName1);
        String amiName2 = "ami-0c123456789012345678901234567889";
        AppVersion appVersion2 = AppVersion.parseName(amiName2);
        assertTrue(appVersion1.compareTo(appVersion2) < 0);
    }

}