package com.netflix.frigga.ami;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTestParseName_InvalidPattern {

    private AppVersion appVersion = new AppVersion();

    @Test
    public void testParseName_InvalidPattern() {
        String amiName = "invalid-pattern";

        // Arrange
        when(appVersion.parseName(amiName)).thenThrow(new ParsingException());

        // Act and Assert
        assertThrows(ParsingException.class, () -> appVersion.parseName(amiName));
    }

}