package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;
import java.lang.reflect.Method;

public class GeneratedGetPackageName_ReturnsPackageName {

    @Test
    public void getPackageName_ReturnsPackageName() {
        AppVersion appVersion = AppVersion.parseName("1.0-ami-1234567890");
        assertEquals(NameConstants.APP_VERSION_PACKAGE, appVersion.getPackageName());
    }

}