package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckContent_ReturnsFalse {

    @Mock
    private ValidationContext validationContext;

    @Test
    public void checkContent_ReturnsFalse() {
        // Arrange
        ValidationContext validationContext = Mockito.mock(ValidationContext.class);

        // Act
        boolean result = OPFChecker30.checkContent(validationContext);

        // Assert
        org.junit.Assert.assertFalse(result);
    }

}