package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

public class GeneratedIsBlessedAudioTypeInvalidAudioTest {

    @Test
    public void isBlessedAudioTypeInvalidAudioTest() {
        assertFalse(OPFChecker30.isBlessedAudioType("audio/mpeg"));
    }

}