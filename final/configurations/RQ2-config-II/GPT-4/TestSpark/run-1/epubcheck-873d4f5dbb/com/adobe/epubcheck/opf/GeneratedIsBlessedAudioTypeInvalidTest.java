package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlessedAudioTypeInvalidTest {

    @Test
    public void isBlessedAudioTypeInvalidTest() {
        assertFalse(OPFChecker30.isBlessedAudioType("text/html"));
    }

}