package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedTestParseNameInvalidPattern {

    public static AppVersion parseName(String amiName) {
        if (amiName == null) {
            return null;
        }
        Matcher matcher = APP_VERSION_PATTERN.matcher(amiName);
        if (!matcher.matches()) {
            return null;
        }
        return new AppVersion();
    }

    @Test
    public void testParseNameInvalidPattern() {
        String amiName = "invalid-pattern";
        AppVersion parsedName = parseName(amiName);
        assertNull(parsedName);
    }

}