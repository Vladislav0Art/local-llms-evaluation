package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsBlessedAudioTypeBlessedMimeTypeTest {

    @Test
    public void isBlessedAudioTypeBlessedMimeTypeTest() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mp4"));
    }

}