package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseName_ContainsPattern_MatchesExactSubstring {

    @Mock
    private Pattern getAppVersionPatternMock;

    @Mock
    private Matcher matcher;

    @Test
    public void parseName_ContainsPattern_MatchesExactSubstring() {
        Mockito.when(getAppVersionPattern()).thenReturn(Pattern.compile("test"));
        String amiName = "test";
        AppVersion appVersion = AppVersion.parseName(amiName);
        // Assert that the matcher is not null
    }

}