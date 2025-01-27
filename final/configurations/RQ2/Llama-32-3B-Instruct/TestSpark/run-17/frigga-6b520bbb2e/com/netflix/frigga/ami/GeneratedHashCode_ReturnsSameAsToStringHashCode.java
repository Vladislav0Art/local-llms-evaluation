package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Random;

public class GeneratedHashCode_ReturnsSameAsToStringHashCode {

    @Test
    public void hashCode_ReturnsSameAsToStringHashCode() {
        String amiName = "ami-0c123456abcdefg";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertEquals(appVersion.hashCode(), appVersion.toString().hashCode());
    }

}