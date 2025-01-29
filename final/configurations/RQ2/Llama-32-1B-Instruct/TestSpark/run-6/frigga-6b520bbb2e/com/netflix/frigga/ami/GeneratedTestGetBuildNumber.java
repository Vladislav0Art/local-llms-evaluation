package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestGetBuildNumber {

    private AppVersion parseName(String amiName) {
        return new AppVersionImpl();
    }

    @Test
    public void testGetBuildNumber() {
        AppVersion appVersion = parseName("ami-name");
        assertNotNull(appVersion);
        assertEquals("1234567890", appVersion.getBuildNumber());
    }

}