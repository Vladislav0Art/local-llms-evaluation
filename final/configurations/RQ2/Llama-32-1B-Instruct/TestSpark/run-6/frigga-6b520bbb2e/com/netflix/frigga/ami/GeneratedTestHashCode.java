package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestHashCode {

    private AppVersion parseName(String amiName) {
        return new AppVersionImpl();
    }

    @Test
    public void testHashCode() {
        AppVersion appVersion1 = parseName("ami-name");
        AppVersion appVersion2 = parseName("ami-name");
        assertNotEquals(0, appVersion1.hashCode());
        assertNotEquals(0, appVersion2.hashCode());
    }

}