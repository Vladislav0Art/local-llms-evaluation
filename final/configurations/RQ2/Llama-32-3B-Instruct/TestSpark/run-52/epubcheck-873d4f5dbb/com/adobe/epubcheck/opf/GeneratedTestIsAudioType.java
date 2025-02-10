package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.InjectMocks;

public class GeneratedTestIsAudioType {

    @Mock
    private ValidationContext context;

    @InjectMocks
    private OPFChecker30 opfChecker30UnderTest;

    @Test
    public void testIsAudioType() {
        assertFalse(opfChecker30UnderTest.isAudioType("other"));
        assertTrue(opfChecker30UnderTest.isAudioType("audio"));
    }

}