package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestEquals {

    private AppVersion parseName(String amiName) {
        return new AppVersionImpl();
    }

    @Test
    public void testEquals() {
        AppVersion appVersion1 = parseName("ami-name");
        AppVersion appVersion2 = parseName("ami-name");
        assertTrue(appVersion1.equals(appVersion2));
        assertFalse(appVersion1.equals(null));
    }

}