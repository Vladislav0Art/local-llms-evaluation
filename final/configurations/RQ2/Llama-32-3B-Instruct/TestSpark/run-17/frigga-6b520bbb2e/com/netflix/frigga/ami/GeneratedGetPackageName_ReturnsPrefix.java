package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Random;

public class GeneratedGetPackageName_ReturnsPrefix {

    @Test
    public void getPackageName_ReturnsPrefix() {
        String amiName = "ami-0c123456abcdefg";
        assertEquals("ami", AppVersion.parseName(amiName).getPackageName());
    }

}