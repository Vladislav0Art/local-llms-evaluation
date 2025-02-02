package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.reflect.Field;

public class GeneratedTestGetBuildJobName {

    private AppVersion parseName(String amiName) {
        return new AppVersion().parseName(amiName);
    }

    @Test
    public void testGetBuildJobName() throws Exception {
        AppVersion appVersion = new AppVersion();
        Field field = AppVersion.class.getDeclaredField("buildJobName");
        field.setAccessible(true);
        field.set(appVersion, "my-job");

        assertEquals("my-job", appVersion.getBuildJobName());
    }

}