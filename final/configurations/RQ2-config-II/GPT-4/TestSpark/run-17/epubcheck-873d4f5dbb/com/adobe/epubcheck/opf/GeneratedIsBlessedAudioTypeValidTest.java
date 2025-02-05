package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsBlessedAudioTypeValidTest {

    @Test
    public void isBlessedAudioTypeValidTest() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mp4"));
    }

}