package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGivenAppVersionPatternAndMultipleMatches_whenParseName_thenParsedSuccessfully {

    @Mock
    private Pattern appVersionPattern;

    @Mock
    private String amiName;

    @Test
    public void givenAppVersionPatternAndMultipleMatches_whenParseName_thenParsedSuccessfully() {
        Pattern appVersionPatternMocked = Mockito.mock(Pattern.class);
        Matcher matcher = Mockito.mock(Matcher.class);
        when(appVersionPattern.matcher(amiName)).thenReturn(matcher);
        AppVersion parsedName = AppVersion.parseName("multipleMatch");
        assertNotNull(parsedName);
        assertEquals(amiName, parsedName.packageName);
        assertEquals(amiName, parsedName.version);
    }

}