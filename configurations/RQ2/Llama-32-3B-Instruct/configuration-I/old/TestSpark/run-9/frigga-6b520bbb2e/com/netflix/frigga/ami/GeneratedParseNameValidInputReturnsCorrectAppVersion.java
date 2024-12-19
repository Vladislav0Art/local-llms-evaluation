package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.regex.Pattern;

public class GeneratedParseNameValidInputReturnsCorrectAppVersion {

    @Test
    public void parseNameValidInputReturnsCorrectAppVersion() {
        String amiName = "1.0-2.0";
        AppVersion appVersion = AppVersion.parseName(amiName);
        // Test implementation
    }

}