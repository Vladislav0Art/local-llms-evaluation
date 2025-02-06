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
public class GeneratedHashCode_ReturnsHashCode {

    @Mock
    private Pattern getAppVersionPatternMock;

    @Mock
    private String amiNameMock;

    public static final String APP_VERSION_PATTERN = "app_version";

    @Test
    public void hashCode_ReturnsHashCode() {
        AppVersion appVersion = new AppVersion();
        int hashCode = 12345;
        when(AppVersion.parseName(amiNameMock)).thenReturn(appVersion);
        when(appVersion.getVersion()).thenReturn("1.0.0");
        assertEquals(hashCode, appVersion.hashCode());
    }

}