package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsAudioType_ReturnsTrue {

    @Mock
    private ValidationContext validationContext;

    @Test
    public void isAudioType_ReturnsTrue() {
        // Arrange
        String type = "audio";

        // Act
        boolean result = OPFChecker30.isAudioType(type);

        // Assert
        org.junit.Assert.assertTrue(result);
    }

}