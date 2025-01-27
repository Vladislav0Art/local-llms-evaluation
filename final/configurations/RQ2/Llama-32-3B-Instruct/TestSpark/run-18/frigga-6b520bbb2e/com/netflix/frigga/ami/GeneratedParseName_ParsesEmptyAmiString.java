package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_ParsesEmptyAmiString {

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
    public void parseName_ParsesEmptyAmiString() {
        String amiName = "";
        Mockito.when(AppVersion::parseName).thenReturn(null);
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNull(appVersion);
    }

}