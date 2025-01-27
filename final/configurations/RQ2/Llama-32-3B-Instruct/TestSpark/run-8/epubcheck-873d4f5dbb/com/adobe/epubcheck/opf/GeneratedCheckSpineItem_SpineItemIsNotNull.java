package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckSpineItem_SpineItemIsNotNull {

    @Mock
    private ValidationContext validationContext;

    @Test
    public void checkSpineItem_SpineItemIsNotNull() {
        // Arrange
        OPFItem item = Mockito.mock(OPFItem.class);
        ValidationContext validationContext = Mockito.mock(ValidationContext.class);

        // Act
        boolean result = OPFChecker30.checkSpineItem(item, validationContext);

        // Assert
        org.junit.Assert.assertTrue(result);
    }

}