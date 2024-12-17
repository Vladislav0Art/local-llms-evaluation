package com.netflix.frigga.ami;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestParseName {

    private AppVersion appVersion = new AppVersion();

    @Test
    public void testParseName() {
        String amiName = "subscriberha-1.0.0-586499";

        // Arrange
        when(appVersion.parseName(amiName)).thenReturn(new AppVersionImpl("subscriberha", "1.0.0", "jenkins-job"));

        // Act and Assert
        assertEquals(new AppVersionImpl("subscriberha", "1.0.0", "jenkins-job"), appVersion.parseName(amiName));
    }

}