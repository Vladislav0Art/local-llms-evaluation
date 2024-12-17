package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestNullVersion {

    private AppVersion appVersion = new AppVersion();

    @Test
    public void testNullVersion() {
        // Arrange
        String amiName = "subscriberha-1.0.0-586499";
        String version = null;

        // Act and Assert
        verify(appVersion, never()).parseName(amiName);
        assertEquals(version, appVersion.getVersion());
    }

}