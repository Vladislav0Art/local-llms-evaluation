package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckItem_ItemIsNotNull {

    @Mock
    private ValidationContext validationContext;

    @Test
    public void checkItem_ItemIsNotNull() {
        // Arrange
        OPFItem item = Mockito.mock(OPFItem.class);
        ValidationContext validationContext = Mockito.mock(ValidationContext.class);

        // Act
        boolean result = OPFChecker30.checkItem(item, validationContext);

        // Assert
        org.junit.Assert.assertTrue(result);
    }

}