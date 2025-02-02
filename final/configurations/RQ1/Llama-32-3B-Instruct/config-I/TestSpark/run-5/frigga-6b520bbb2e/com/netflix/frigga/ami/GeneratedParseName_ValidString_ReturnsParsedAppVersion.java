package com.netflix.frigga.ami;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedParseName_ValidString_ReturnsParsedAppVersion {

    @Test
    public void parseName_ValidString_ReturnsParsedAppVersion() {
        // given
        String amiName = "subscriberha-1.0.0-586499";
        Pattern pattern = AppVersion.PUBLIC_APP_VERSION_PATTERN;

        // when
        AppVersion parsedName = AppVersion.parseName(amiName);

        // then
        assertNotNull(parsedName);
    }

}