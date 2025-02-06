package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetPackageName_ReturnsExpectedPackageName {

    @Test
    public void getPackageName_ReturnsExpectedPackageName() {
        String packageName = "com.example.app";
        assertEquals(packageName, AppVersion.parseName("ami-1234567890").getPackageName());
    }

}