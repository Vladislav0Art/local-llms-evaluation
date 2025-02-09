package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

public class GeneratedIsBlessedAudioTypeValidAudioTest {

    @Test
    public void isBlessedAudioTypeValidAudioTest() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mp3"));
    }

}