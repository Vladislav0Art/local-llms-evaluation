package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.reflect.Field;

public class GeneratedTestGetPackageName {

    private AppVersion parseName(String amiName) {
        return new AppVersion().parseName(amiName);
    }

    @Test
    public void testGetPackageName() throws Exception {
        AppVersion appVersion = new AppVersion();
        Field field = AppVersion.class.getDeclaredField("packageName");
        field.setAccessible(true);
        field.set(appVersion, "my-package");

        assertEquals("my-package", appVersion.getPackageName());
    }

}