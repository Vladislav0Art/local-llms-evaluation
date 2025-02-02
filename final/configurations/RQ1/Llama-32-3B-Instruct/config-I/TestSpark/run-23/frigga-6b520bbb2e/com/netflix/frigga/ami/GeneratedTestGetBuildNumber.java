package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.reflect.Field;

public class GeneratedTestGetBuildNumber {

    private AppVersion parseName(String amiName) {
        return new AppVersion().parseName(amiName);
    }

    @Test
    public void testGetBuildNumber() throws Exception {
        AppVersion appVersion = new AppVersion();
        Field field = AppVersion.class.getDeclaredField("buildNumber");
        field.setAccessible(true);
        field.set(appVersion, "123");

        assertEquals("123", appVersion.getBuildNumber());
    }

}