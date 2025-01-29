package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestParseName {

    private AppVersion parseName(String amiName) {
        return new AppVersionImpl();
    }

    @Test
    public void testParseName() {
        String amiName = "ami-name";
        AppVersion appVersion = parseName(amiName);
        assertNotNull(appVersion);
        assertEquals("ami-name", appVersion.getPackageName());
    }

}