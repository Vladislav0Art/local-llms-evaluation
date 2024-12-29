package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedIsBlessedAudioTypeNotFoundTest {

    @Test
    public void isBlessedAudioTypeNotFoundTest() {
        assertFalse(OPFChecker30.isBlessedAudioType("unknownType"));
    }

}