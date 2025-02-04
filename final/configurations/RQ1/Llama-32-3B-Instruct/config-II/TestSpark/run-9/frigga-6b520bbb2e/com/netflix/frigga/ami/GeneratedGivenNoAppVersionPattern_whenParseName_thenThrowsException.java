package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGivenNoAppVersionPattern_whenParseName_thenThrowsException {

    @Mock
    private Pattern appVersionPattern;

    @Mock
    private String amiName;

    @Test
    public void givenNoAppVersionPattern_whenParseName_thenThrowsException() {
        AppVersion parsedName = null;
        try {
            AppVersion.parseName("invalidData");
        } catch (Exception e) {
            assertNull(parsedName);
        }
    }

}