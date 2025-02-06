package com.netflix.frigga.ami;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class GeneratedParseName_ThrowsException_WhenAmitrueNotFound {

    @Test
    public void parseName_ThrowsException_WhenAmitrueNotFound() {
        String amiName = "ami-false";
        AppVersion appVersion = null;
        try {
            AppVersion.parseName(amiName);
            assert false : "Expected exception was not thrown";
        } catch (Exception e) {
        }
    }

}