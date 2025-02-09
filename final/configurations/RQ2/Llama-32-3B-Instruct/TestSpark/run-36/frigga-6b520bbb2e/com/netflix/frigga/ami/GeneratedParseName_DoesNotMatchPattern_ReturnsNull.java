package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseName_DoesNotMatchPattern_ReturnsNull {

    @Mock
    private Pattern getAppVersionPatternMock;

    @Mock
    private Matcher matcher;

    @Test
    public void parseName_DoesNotMatchPattern_ReturnsNull() {
        Mockito.when(getAppVersionPattern()).thenReturn(Pattern.compile(".*"));
        String amiName = "test";
        AppVersion appVersion = AppVersion.parseName(amiName);
        assert appVersion == null;
    }

}