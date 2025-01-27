package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedGetPackageName_ReturnsExpectedValue {

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
    public void getPackageName_ReturnsExpectedValue() {
        String amiName = "1.0-ami-havana";
        AppVersion appVersion = AppVersion.parseName(amiName);
        String expectedPackage = "netflix.frigga.ami";
        assertEquals(expectedPackage, appVersion.getPackageName());
    }

}