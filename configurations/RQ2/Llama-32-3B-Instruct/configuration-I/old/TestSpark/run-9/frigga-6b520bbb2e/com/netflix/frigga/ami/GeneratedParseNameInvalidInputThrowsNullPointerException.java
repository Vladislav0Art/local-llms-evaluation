package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.regex.Pattern;

public class GeneratedParseNameInvalidInputThrowsNullPointerException {

    @Test
    public void parseNameInvalidInputThrowsNullPointerException() {
        String amiName = null;
        try {
            AppVersion.appVersionPattern.matcher(amiName);
            Assert.fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}