package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.reflect.Field;

public class GeneratedTestGetCommit {

    private AppVersion parseName(String amiName) {
        return new AppVersion().parseName(amiName);
    }

    @Test
    public void testGetCommit() throws Exception {
        AppVersion appVersion = new AppVersion();
        Field field = AppVersion.class.getDeclaredField("commit");
        field.setAccessible(true);
        field.set(appVersion, "my-commit");

        assertEquals("my-commit", appVersion.getCommit());
    }

}