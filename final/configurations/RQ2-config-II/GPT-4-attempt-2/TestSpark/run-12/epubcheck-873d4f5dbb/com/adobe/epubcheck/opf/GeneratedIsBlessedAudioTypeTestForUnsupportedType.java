package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedIsBlessedAudioTypeTestForUnsupportedType {

    @Test
    public void isBlessedAudioTypeTestForUnsupportedType() {
        assertFalse(OPFChecker30.isBlessedAudioType("audio/wma"));
    }

}