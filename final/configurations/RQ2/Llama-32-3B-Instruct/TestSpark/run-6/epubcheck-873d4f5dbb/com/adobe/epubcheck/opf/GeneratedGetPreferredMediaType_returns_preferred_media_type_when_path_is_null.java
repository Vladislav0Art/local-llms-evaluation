package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetPreferredMediaType_returns_preferred_media_type_when_path_is_null {

    @Mock
    private ValidationContext context;

    @Mock
    private OPFChecker opfChecker;

    public void initHandler() {
        opfChecker.initHandler();
    }

    @Test
    public void getPreferredMediaType_returns_preferred_media_type_when_path_is_null() {
        when(opfChecker.getMediaOverlaysVocab()).thenReturn(new MediaOverlaysVocab());
        assertEquals("preferred media type", OPFChecker30.getPreferredMediaType("application/smil", null));
    }

}