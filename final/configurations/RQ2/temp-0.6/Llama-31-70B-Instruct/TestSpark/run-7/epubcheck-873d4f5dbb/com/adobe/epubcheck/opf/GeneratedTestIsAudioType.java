package com.adobe.epubcheck.opf;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedTestIsAudioType {

    private OPFChecker30 opfChecker30;

    @Before
    public void setUp() {
        opfChecker30 = new OPFChecker30(Mockito.mock(ValidationContext.class));
    }

    @Test
    public void testIsAudioType() {
        assertEquals(false, opfChecker30.isAudioType(null));
        assertEquals(false, opfChecker30.isAudioType(""));
        assertEquals(false, opfChecker30.isAudioType("audio/"));
        assertEquals(true, opfChecker30.isAudioType("audio/mpeg"));
    }

}