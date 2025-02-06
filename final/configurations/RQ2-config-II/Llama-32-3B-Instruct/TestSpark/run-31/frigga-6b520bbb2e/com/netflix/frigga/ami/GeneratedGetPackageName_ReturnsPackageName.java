package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetPackageName_ReturnsPackageName {

    @Test
    public void getPackageName_ReturnsPackageName() {
        AppVersion appVersion = new AppVersion();
        assertEquals("com.netflix.frigga.ami", appVersion.getPackageName());
    }

}