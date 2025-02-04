package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGivenAppVersionPatternAndInvalidData_whenParseName_thenReturnsNull {

    @Mock
    private Pattern appVersionPattern;

    @Mock
    private String amiName;

    @Test
    public void givenAppVersionPatternAndInvalidData_whenParseName_thenReturnsNull() {
        Pattern appVersionPatternMocked = Mockito.mock(Pattern.class);
        Matcher matcher = Mockito.mock(Matcher.class);
        when(appVersionPattern.matcher(amiName)).thenReturn(matcher);
        AppVersion parsedName = AppVersion.parseName("invalidData");
        assertNull(parsedName);
    }

}