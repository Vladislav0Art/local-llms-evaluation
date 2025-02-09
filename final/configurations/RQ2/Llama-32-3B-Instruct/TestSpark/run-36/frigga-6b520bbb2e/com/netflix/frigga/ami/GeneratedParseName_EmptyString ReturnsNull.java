package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseName_EmptyString ReturnsNull {

    @Mock
    private Pattern getAppVersionPatternMock;

    @Mock
    private Matcher matcher;

    @Test
    public void parseName_EmptyString

    ReturnsNull() {
        Mockito.when(getAppVersionPattern()).thenReturn(appVersionPattern());
        AppVersion appVersion = AppVersion.parseName("");
        assert appVersion == null;
    }

}