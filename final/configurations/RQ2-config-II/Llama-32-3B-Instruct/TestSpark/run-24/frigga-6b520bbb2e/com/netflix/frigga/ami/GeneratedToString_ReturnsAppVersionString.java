package com.netflix.frigga.ami;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedToString_ReturnsAppVersionString {

    @Mock
    private Pattern getAppVersionPatternMock;

    @Mock
    private String amiNameMock;

    public static final String APP_VERSION_PATTERN = "app_version";

    @Test
    public void toString_ReturnsAppVersionString() {
        AppVersion appVersion = new AppVersion();
        String version = "1.0.0";
        when(AppVersion.parseName(amiNameMock)).thenReturn(appVersion);
        when(appVersion.getVersion()).thenReturn(version);
        assertEquals("app_version_1.0.0", appVersion.toString());
    }

}