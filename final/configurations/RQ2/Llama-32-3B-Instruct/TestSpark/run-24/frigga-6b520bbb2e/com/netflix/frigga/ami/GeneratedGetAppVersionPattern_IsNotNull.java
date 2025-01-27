package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetAppVersionPattern_IsNotNull {

    @Test
    public void getAppVersionPattern_IsNotNull() {
        Pattern pattern = AppVersion.getAppVersionPattern();
        assertNotNull(pattern);
    }
}

public class AppVersion {

    public static AppVersion parseName(String amiName) { /* implementation */ }

    public int compareTo(AppVersion other) { /* implementation */ }

    public static Pattern getAppVersionPattern() { /* implementation */ }

    // implementation
}

}