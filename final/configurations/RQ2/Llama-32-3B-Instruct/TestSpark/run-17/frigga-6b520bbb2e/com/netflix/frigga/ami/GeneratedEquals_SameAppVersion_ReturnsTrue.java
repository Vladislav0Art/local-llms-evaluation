package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Random;

public class GeneratedEquals_SameAppVersion_ReturnsTrue {

    @Test
    public void equals_SameAppVersion_ReturnsTrue() {
        String amiName = "ami-0c123456abcdefg";
        AppVersion appVersion1 = AppVersion.parseName(amiName);
        AppVersion appVersion2 = new AppVersion(appVersion1);
        assertTrue(appVersion1.equals(appVersion2));
    }

}