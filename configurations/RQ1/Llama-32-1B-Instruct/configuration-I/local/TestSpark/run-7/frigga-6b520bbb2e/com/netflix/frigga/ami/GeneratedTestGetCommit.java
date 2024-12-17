package com.netflix.frigga.ami;

import com.netflix.frigga.NameConstants;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestGetCommit {

    private AppVersion appVersion = new AppVersion();

    @Test
    public void testGetCommit() {
        // Arrange
        String amiName = "subscriberha-1.0.0-586499";
        when(appVersion.getCommit()).thenReturn("commit-id");

        // Act and Assert
        assertEquals("commit-id", appVersion.getCommit());
    }

}