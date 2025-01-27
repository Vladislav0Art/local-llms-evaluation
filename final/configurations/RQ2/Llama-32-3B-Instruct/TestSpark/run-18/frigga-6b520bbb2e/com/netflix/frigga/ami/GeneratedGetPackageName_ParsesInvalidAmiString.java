package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetPackageName_ParsesInvalidAmiString {

    public String getPackageName() {
        return "netflix.frigga.ami";
    }

    public static AppVersion parseName(String amiString) {
        // Implementation
        return new AppVersion();
    }
}

public class AppVersionTest {

    @Test
    public void getPackageName_ParsesInvalidAmiString() {
        String amiName = "invalid-ami-string";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotEquals("netflix.frigga.ami", appVersion.getPackageName());
    }

}