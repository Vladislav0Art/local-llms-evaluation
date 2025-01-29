package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestGetPackageName {

    private AppVersion parseName(String amiName) {
        return new AppVersionImpl();
    }

    @Test
    public void testGetPackageName() {
        AppVersion appVersion = parseName("ami-name");
        assertNotNull(appVersion);
        assertEquals("ami-name", appVersion.getPackageName());
    }

}