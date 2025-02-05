package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlessedAudioTypeInvalidMediaTypeTest {

    //isAudioType tests

    @Test
    public void isBlessedAudioTypeInvalidMediaTypeTest() {
        assertFalse(OPFChecker30.isBlessedAudioType("text/html"));
    }

}