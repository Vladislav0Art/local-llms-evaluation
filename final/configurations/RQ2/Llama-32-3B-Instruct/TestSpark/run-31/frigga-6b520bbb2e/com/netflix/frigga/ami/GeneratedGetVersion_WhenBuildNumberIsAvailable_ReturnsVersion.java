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
public class GeneratedGetVersion_WhenBuildNumberIsAvailable_ReturnsVersion {

    @Mock
    private Pattern getAppVersionPatternMock;

    @Mock
    private String amiNameMock;

    @Test
    public void getVersion_WhenBuildNumberIsAvailable_ReturnsVersion() {
        AppVersion appVersion = new AppVersion();
        String buildNumber = "test-build-number";
        when(appVersion.getBuildNumber()).thenReturn(buildNumber);
        assertEquals(buildNumber, appVersion.getVersion());
    }

}