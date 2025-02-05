package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedIsBlessedAudioTypeInvalidMediaTypeTest {

    @Test
    public void isBlessedAudioTypeInvalidMediaTypeTest() {
        assertFalse(OPFChecker30.isBlessedAudioType("invalid/audio"));
    }

}