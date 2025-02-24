package com.netflix.frigga.ami;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedCompareToTest {

    @Test
    public void compareToTest() {
        // Arrange
        AppVersion other = mock(AppVersion.class);
        AppVersion appVersion = new AppVersion();
        int expected = 0;

        // Act
        int actual = appVersion.compareTo(other);

        // Assert
        assertEquals(expected, actual);
    }

}