package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedEquals_AppVersionNotEquals {

    @Test
    public void equals_AppVersionNotEquals() {
        String amiName1 = "ami-0c123456789012345678901234567890";
        AppVersion appVersion1 = AppVersion.parseName(amiName1);
        String amiName2 = "ami-12345678901234567890123456789";
        AppVersion appVersion2 = AppVersion.parseName(amiName2);
        assertFalse(appVersion1.equals(appVersion2));
    }

}