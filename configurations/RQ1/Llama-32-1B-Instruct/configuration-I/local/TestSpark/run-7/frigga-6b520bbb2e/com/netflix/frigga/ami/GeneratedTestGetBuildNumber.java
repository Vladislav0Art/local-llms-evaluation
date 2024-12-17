package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestGetBuildNumber {

    private AppVersion appVersion = new AppVersion();

    @Test
    public void testGetBuildNumber() {
        // Arrange
        String amiName = "subscriberha-1.0.0-586499";
        when(appVersion.getBuildNumber()).thenReturn("1");

        // Act and Assert
        assertEquals("1", appVersion.getBuildNumber());
    }

}