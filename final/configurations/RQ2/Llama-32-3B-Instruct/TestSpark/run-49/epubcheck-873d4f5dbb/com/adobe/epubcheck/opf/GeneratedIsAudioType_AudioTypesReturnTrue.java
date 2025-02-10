package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsAudioType_AudioTypesReturnTrue {

    @Mock
    private ValidationContext context;

    public void setUp() {
        when(context.getEPUBLocation()).thenReturn(EPUBLocation.of("http://example.com"));
    }

    @Test
    public void isAudioType_AudioTypesReturnTrue() {
        assertTrue(OPFChecker30.class.getMethod("isAudioType", String.class).invoke(null, "audio"));
    }

}