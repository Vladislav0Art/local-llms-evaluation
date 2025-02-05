package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlessedVideoTypeInvalidMediaTypeTest {

    //isAudioType tests

    @Test
    public void isBlessedVideoTypeInvalidMediaTypeTest() {
        assertFalse(OPFChecker30.isBlessedVideoType("application/pdf"));
    }

}