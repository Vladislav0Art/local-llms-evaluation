package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestToString {

    private AppVersion appVersion = new AppVersion();

    @Test
    public void testToString() {
        // Arrange
        String amiName = "subscriberha-1.0.0-586499";

        // Act
        StringBuilder builder = new StringBuilder();
        appVersion.toString(builder);

        // Assert
        assertEquals("AppVersion [packageName=subscriberha, version=1.0.0, buildJobName=jenkins-job, buildNumber=1, changelist=commit-id]", builder.toString());
    }

}