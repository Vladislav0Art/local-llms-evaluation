package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsVideoType_ReturnsFalse {

    @Mock
    private ValidationContext validationContext;

    @Test
    public void isVideoType_ReturnsFalse() {
        // Arrange
        String type = "video";

        // Act
        boolean result = OPFChecker30.isVideoType(type);

        // Assert
        org.junit.Assert.assertFalse(result);
    }

}