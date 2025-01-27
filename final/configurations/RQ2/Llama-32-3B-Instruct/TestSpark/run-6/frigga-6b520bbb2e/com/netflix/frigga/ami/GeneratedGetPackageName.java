package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetPackageName {

    @Test
    public void getPackageName() {
        AppVersion appVersion = AppVersion.parseName("amarth-1234567890");
        assertNotNull(appVersion.getPackageName());
    }

}