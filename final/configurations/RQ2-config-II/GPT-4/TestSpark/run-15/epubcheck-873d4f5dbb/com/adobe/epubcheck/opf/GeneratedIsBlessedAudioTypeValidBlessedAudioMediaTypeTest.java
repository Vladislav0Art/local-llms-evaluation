package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlessedAudioTypeValidBlessedAudioMediaTypeTest {

    //isAudioType tests

    @Test
    public void isBlessedAudioTypeValidBlessedAudioMediaTypeTest() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mpeg"));
    }

}