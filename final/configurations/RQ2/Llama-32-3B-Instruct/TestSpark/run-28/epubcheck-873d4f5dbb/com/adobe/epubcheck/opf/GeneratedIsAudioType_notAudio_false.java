package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsAudioType_notAudio_false {

    @Mock
    private ValidationContext context;

    @Mock
    private OPFHandler handler;

    public void testInitHandler() {
        when(handler.init()).thenReturn(true);
        assertDoesNotThrow(OPFChecker30::initHandler);
    }

    @Test
    public void isAudioType_notAudio_false() {
        assertFalse(OPFChecker30.isAudioType("not audio"));
    }

}