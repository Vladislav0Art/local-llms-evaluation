package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestNullBuildJobName {

    private AppVersion appVersion = new AppVersion();

    @Test
    public void testNullBuildJobName() {
        // Arrange
        String amiName = "subscriberha-1.0.0-586499";
        String buildJobName = null;

        // Act and Assert
        verify(appVersion, never()).parseName(amiName);
    }

}