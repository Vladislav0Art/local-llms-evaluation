package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsBlessedAudioType_returns_true_for_blessed_audio_types {

    @Mock
    private ValidationContext context;

    @Mock
    private OPFChecker opfChecker;

    public void initHandler() {
        opfChecker.initHandler();
    }

    @Test
    public void isBlessedAudioType_returns_true_for_blessed_audio_types() {
        when(opfChecker.getPreferredMediaType("application/smil", "path")).thenReturn("blessed audio type");
        assertTrue(OPFChecker30.isBlessedAudioType("application/smil"));
    }

}