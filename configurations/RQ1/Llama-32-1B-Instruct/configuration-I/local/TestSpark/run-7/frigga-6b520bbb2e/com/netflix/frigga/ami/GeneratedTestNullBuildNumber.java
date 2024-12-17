package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestNullBuildNumber {

    private AppVersion appVersion = new AppVersion();

    @Test
    public void testNullBuildNumber() {
        // Arrange
        String amiName = "subscriberha-1.0.0-586499";
        String buildNumber = null;

        // Act and Assert
        verify(appVersion, never()).parseName(amiName);
    }

}