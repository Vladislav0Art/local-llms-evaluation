package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsBlessedAudioType_ReturnsTrue {

    @Mock
    private ValidationContext validationContext;

    @Test
    public void isBlessedAudioType_ReturnsTrue() {
        // Arrange
        String type = "blessed-audio";

        // Act
        boolean result = OPFChecker30.isBlessedAudioType(type);

        // Assert
        org.junit.Assert.assertTrue(result);
    }

}