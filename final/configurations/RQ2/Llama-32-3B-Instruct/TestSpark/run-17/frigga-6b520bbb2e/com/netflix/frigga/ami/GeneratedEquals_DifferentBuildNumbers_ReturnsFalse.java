package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Random;

public class GeneratedEquals_DifferentBuildNumbers_ReturnsFalse {

    @Test
    public void equals_DifferentBuildNumbers_ReturnsFalse() {
        String amiName = "ami-0c123456abcdefg";
        AppVersion appVersion1 = AppVersion.parseName(amiName);
        AppVersion appVersion2 = new AppVersion("ami-0c123456abcdefh");
        assertFalse(appVersion1.equals(appVersion2));
    }

}