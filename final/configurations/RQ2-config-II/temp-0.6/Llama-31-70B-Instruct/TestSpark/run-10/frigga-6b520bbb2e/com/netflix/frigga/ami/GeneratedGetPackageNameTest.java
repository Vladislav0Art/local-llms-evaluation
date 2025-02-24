package com.netflix.frigga.ami;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedGetPackageNameTest {

    @Test
    public void getPackageNameTest() {
        // Arrange
        AppVersion appVersion = new AppVersion();
        String expected = "packageName";

        // Act
        String actual = appVersion.getPackageName();

        // Assert
        assertEquals(expected, actual);
    }

}