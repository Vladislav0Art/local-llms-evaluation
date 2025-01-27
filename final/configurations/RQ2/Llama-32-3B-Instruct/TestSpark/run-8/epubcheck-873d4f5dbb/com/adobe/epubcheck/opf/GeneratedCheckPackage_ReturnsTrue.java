package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckPackage_ReturnsTrue {

    @Mock
    private ValidationContext validationContext;

    @Test
    public void checkPackage_ReturnsTrue() {
        // Arrange
        ValidationContext validationContext = Mockito.mock(ValidationContext.class);

        // Act
        boolean result = OPFChecker30.checkPackage(validationContext);

        // Assert
        org.junit.Assert.assertTrue(result);
    }

}