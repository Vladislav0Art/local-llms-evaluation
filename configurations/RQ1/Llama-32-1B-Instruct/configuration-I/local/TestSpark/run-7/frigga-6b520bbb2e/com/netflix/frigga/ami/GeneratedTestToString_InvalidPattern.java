package com.netflix.frigga.ami;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestToString_InvalidPattern {

    private AppVersion appVersion = new AppVersion();

    @Test
    public void testToString_InvalidPattern() {
        String amiName = "invalid-pattern";

        // Arrange
        when(appVersion.toString()).thenReturn("AppVersion [packageName=subscriberha, version=1.0.0, buildJobName=jenkins-job, buildNumber=1, changelist=commit-id]");

        // Act and Assert
        assertEquals("AppVersion [packageName=subscriberha, version=1.0.0, buildJobName=jenkins-job, buildNumber=1, changelist=commit-id]", appVersion.toString());
    }

    private static class ParsingException extends Exception {
    }

    public void testToString() {
        String amiName = "subscriberha-1.0.0-586499";

        // Arrange
        when(appVersion.toString()).thenReturn("AppVersion [packageName=subscriberha, version=1.0.0, buildJobName=jenkins-job, buildNumber=1, changelist=commit-id]");

        // Act and Assert
        assertEquals("AppVersion [packageName=subscriberha, version=1.0.0, buildJobName=jenkins-job, buildNumber=1, changelist=commit-id]", appVersion.toString());
    }

    public static void main(String[] args) {
        TestSpark.run(() -> {
            appVersion.testToString();
        });
    }

}