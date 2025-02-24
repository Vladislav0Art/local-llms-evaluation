package com.netflix.frigga.ami;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedGetBuildJobNameTest {

    @Test
    public void getBuildJobNameTest() {
        // Arrange
        AppVersion appVersion = new AppVersion();
        String expected = "jobName";

        // Act
        String actual = appVersion.getBuildJobName();

        // Assert
        assertEquals(expected, actual);
    }

}