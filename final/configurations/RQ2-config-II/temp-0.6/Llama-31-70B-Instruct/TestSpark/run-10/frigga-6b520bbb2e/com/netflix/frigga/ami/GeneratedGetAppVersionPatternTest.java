package com.netflix.frigga.ami;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedGetAppVersionPatternTest {

    @Test
    public void getAppVersionPatternTest() {
        // Arrange
        Pattern expected = Pattern.compile("");

        // Act
        Pattern actual = AppVersion.getAppVersionPattern();

        // Assert
        assertEquals(expected, actual);
    }

}