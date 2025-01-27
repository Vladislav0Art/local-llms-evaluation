package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.mockito.Mockito;

public class GeneratedParseName_ParsesValidAmiString {

    public static AppVersion parseName(String amiString) {
        // Implementation
        return new AppVersion();
    }

    public String getPackageName() {
        return "netflix.frigga.ami";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        AppVersion appVersion = (AppVersion) obj;

        return true;
    }
}

public class AppVersionTest {

    @Test
    public void parseName_ParsesValidAmiString() {
        String amiName = "1.0-ami-havana";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assertNotNull(appVersion);
    }

}