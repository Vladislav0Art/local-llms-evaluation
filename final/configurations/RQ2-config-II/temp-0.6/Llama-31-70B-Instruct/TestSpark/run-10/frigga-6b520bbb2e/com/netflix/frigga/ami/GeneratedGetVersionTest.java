package com.netflix.frigga.ami;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedGetVersionTest {

    @Test
    public void getVersionTest() {
        // Arrange
        AppVersion appVersion = new AppVersion();
        String expected = "version";

        // Act
        String actual = appVersion.getVersion();

        // Assert
        assertEquals(expected, actual);
    }

}