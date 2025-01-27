package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class GeneratedCheckPackage_HasValidOPF_ReturnsTrue {

    @Test
    public void checkPackage_HasValidOPF_ReturnsTrue() throws Exception {
        // arrange
        OPFItem item = mock(OPFItem.class);
        when(item.getOPF()).thenReturn("valid-opf");

        ValidationContext context = new ValidationContext();
        OPFChecker30 checker = new OPFChecker30(context);

        // act
        boolean result = checker.checkPackage();

        // assert
        assertTrue(result);
    }

}