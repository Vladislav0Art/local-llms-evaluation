package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetPackageName_ReturnsPackage NameTest {

    @Test
    public void getPackageName_ReturnsPackage

    NameTest() {
        String packageName = "com.netflix.frigga";
        assertEquals(packageName, AppVersion.getPackageName());
    }

}