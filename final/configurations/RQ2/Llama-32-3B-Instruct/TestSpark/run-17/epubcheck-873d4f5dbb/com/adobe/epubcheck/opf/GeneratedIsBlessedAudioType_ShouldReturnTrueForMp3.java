package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsBlessedAudioType_ShouldReturnTrueForMp3 {

    @Mock
    private ValidationContext context;

    @Mock
    private OPFHandler opfHandler;

    @Test
    public void isBlessedAudioType_ShouldReturnTrueForMp3() {
        String type = "audio/mpeg-3.1";
        assertTrue(OPFChecker30.isBlessedAudioType(type));
    }

}