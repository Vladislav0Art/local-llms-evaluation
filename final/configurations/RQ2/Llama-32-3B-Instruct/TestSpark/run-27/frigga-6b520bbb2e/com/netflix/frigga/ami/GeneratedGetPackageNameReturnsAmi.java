package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetPackageNameReturnsAmi {

    @Test
    public void getPackageNameReturnsAmi() {
        AppVersion appVersion = new AppVersion("1.2.3-ami-amzn2");
        assertEquals("ami", appVersion.getPackageName());
    }

}