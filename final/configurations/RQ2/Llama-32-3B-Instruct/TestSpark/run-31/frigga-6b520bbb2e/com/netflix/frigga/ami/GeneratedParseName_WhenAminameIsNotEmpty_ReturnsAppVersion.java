package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedParseName_WhenAminameIsNotEmpty_ReturnsAppVersion {

    @Mock
    private Pattern getAppVersionPatternMock;

    @Mock
    private String amiNameMock;

    @Test
    public void parseName_WhenAminameIsNotEmpty_ReturnsAppVersion() {
        when(AppVersion.parseName(amiNameMock)).thenReturn(new AppVersion());
        AppVersion appVersion = AppVersion.parseName(amiNameMock);
        assertNotNull(appVersion);
    }

}