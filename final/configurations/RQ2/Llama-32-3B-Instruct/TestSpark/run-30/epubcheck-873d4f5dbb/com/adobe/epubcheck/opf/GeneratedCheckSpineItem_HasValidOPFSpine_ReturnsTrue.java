package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedCheckSpineItem_HasValidOPFSpine_ReturnsTrue {

    @Test
    public void checkSpineItem_HasValidOPFSpine_ReturnsTrue() throws Exception {
        // arrange
        OPFItem item = mock(OPFItem.class);
        when(item.getOPF()).thenReturn("valid-opf");

        ValidationContext context = new ValidationContext();
        OPFChecker30 checker = new OPFChecker30(context);

        // act
        boolean result = checker.checkSpineItem(item, mock(OPFHandler.class));

        // assert
        assertTrue(result);
    }

}