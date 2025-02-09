package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedIsBlessedAudioTypeTestForSupportedType {

    @Test
    public void isBlessedAudioTypeTestForSupportedType() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mp3"));
    }

}