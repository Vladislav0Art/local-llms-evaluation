package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Set;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetPreferredMediaType_AudioType_Path_ReturnsAudioType {

    @Mock
    private ValidationContext context;

    @Mock
    private Set<Reference> references;

    @Test
    public void getPreferredMediaType_AudioType_Path_ReturnsAudioType() {
        String result = OPFChecker30.getPreferredMediaType("audio", "path");
        assertEquals("audio", result);
    }

}