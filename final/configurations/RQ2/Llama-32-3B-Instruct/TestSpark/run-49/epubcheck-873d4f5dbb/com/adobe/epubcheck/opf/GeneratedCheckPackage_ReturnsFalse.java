package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckPackage_ReturnsFalse {

    @Mock
    private ValidationContext context;

    public void setUp() {
        when(context.getEPUBLocation()).thenReturn(EPUBLocation.of("http://example.com"));
    }

    @Test
    public void checkPackage_ReturnsFalse() {
        assertTrue(OPFChecker30.class.getMethod("checkPackage", ValidationContext.class).invoke(null, context));
    }

}