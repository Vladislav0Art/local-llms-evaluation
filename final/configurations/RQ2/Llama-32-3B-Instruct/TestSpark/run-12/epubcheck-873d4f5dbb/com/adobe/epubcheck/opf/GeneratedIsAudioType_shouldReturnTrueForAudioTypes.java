package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsAudioType_shouldReturnTrueForAudioTypes {

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
    public void isAudioType_shouldReturnTrueForAudioTypes() {
        assertTrue(OPFChecker30.isAudioType("audio"));
        assertTrue(OPFChecker30.isBlessedAudioType("blessed audio"));
        assertFalse(OPFChecker30.isVideoType("video"));
        assertFalse(OPFChecker30.isCommonVideoType("common video"));
    }

}