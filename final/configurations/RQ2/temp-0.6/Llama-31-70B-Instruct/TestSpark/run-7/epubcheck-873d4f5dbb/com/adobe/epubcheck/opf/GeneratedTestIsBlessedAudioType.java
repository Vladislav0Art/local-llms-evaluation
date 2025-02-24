package com.adobe.epubcheck.opf;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedTestIsBlessedAudioType {

    private OPFChecker30 opfChecker30;

    @Before
    public void setUp() {
        opfChecker30 = new OPFChecker30(Mockito.mock(ValidationContext.class));
    }

    @Test
    public void testIsBlessedAudioType() {
        assertEquals(false, opfChecker30.isBlessedAudioType(null));
        assertEquals(false, opfChecker30.isBlessedAudioType(""));
        assertEquals(false, opfChecker30.isBlessedAudioType("audio/"));
        assertEquals(true, opfChecker30.isBlessedAudioType("audio/mpeg"));
    }

}