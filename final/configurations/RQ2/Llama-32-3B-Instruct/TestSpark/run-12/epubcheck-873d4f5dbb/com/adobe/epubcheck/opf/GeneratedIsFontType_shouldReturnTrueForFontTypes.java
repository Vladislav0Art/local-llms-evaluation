package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsFontType_shouldReturnTrueForFontTypes {

    @Mock
    private ValidationContext context;

    @Mock
    private OPFItem item;

    @Mock
    private OPFHandler opfHandler;

    @Mock
    private Reference reference;

    @Mock
    private URLFragment urlFragment;

    @Test
    public void isFontType_shouldReturnTrueForFontTypes() {
        assertTrue(OPFChecker30.isFontType("font"));
        assertTrue(OPFChecker30.isBlessedFontType("blessed font"));
        assertFalse(OPFChecker30.isAudioType("audio"));
    }

}