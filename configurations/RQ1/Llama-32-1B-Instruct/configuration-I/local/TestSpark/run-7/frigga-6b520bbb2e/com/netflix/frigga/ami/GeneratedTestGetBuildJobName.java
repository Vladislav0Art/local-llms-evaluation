package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestGetBuildJobName {

    private AppVersion appVersion = new AppVersion();

    @Test
    public void testGetBuildJobName() {
        // Arrange
        String amiName = "subscriberha-1.0.0-586499";
        when(appVersion.getBuildJobName()).thenReturn("jenkins-job");

        // Act and Assert
        assertEquals("jenkins-job", appVersion.getBuildJobName());
    }

}