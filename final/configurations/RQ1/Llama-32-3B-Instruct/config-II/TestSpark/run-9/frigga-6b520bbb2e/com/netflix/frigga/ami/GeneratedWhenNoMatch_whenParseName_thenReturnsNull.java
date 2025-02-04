package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedWhenNoMatch_whenParseName_thenReturnsNull {

    @Mock
    private Pattern appVersionPattern;

    @Mock
    private String amiName;

    @Test
    public void whenNoMatch_whenParseName_thenReturnsNull() {
        AppVersion parsedName = AppVersion.parseName(null);
        assertNull(parsedName);
    }

}