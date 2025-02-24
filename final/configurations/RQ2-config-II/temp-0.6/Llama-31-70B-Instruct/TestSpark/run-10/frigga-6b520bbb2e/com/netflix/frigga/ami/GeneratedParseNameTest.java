package com.netflix.frigga.ami;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedParseNameTest {

    @Test
    public void parseNameTest() {
        // Arrange
        String amiName = "ami-12345";
        AppVersion expected = new AppVersion();

        // Act
        AppVersion actual = AppVersion.parseName(amiName);

        // Assert
        assertEquals(expected, actual);
    }

}