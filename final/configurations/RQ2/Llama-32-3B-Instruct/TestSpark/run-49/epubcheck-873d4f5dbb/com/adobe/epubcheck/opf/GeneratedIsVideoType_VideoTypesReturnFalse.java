package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsVideoType_VideoTypesReturnFalse {

    @Mock
    private ValidationContext context;

    public void setUp() {
        when(context.getEPUBLocation()).thenReturn(EPUBLocation.of("http://example.com"));
    }

    @Test
    public void isVideoType_VideoTypesReturnFalse() {
        assertFalse(OPFChecker30.class.getMethod("isVideoType", String.class).invoke(null, "video"));
    }

}