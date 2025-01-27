package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Set;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsBlessedAudioType_NonAudioType_ReturnsFalse {

    @Mock
    private ValidationContext context;

    @Mock
    private Set<Reference> references;

    @Test
    public void isBlessedAudioType_NonAudioType_ReturnsFalse() {
        assertFalse(OPFChecker30.isBlessedAudioType("text"));
    }

}