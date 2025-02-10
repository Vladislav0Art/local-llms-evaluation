package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedInitHandler_ReturnsTrue {

    @Mock
    private ValidationContext context;

    public void setUp() {
        when(context.getEPUBLocation()).thenReturn(EPUBLocation.of("http://example.com"));
    }

    @Test
    public void initHandler_ReturnsTrue() {
        when(context.isFirstRun()).thenReturn(true);
        assertTrue(OPFChecker30.class.getMethod("initHandler", ValidationContext.class).invoke(null, context));
    }

}