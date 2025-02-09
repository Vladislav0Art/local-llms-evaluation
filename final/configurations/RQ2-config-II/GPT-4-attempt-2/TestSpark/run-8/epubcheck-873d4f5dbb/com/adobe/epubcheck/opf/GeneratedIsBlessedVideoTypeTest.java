package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedIsBlessedVideoTypeTest {

    @Test
    public void isBlessedVideoTypeTest() {
        assertTrue(OPFChecker30.isBlessedVideoType("video/mp4"));
        assertFalse(OPFChecker30.isBlessedVideoType("video/avi"));
    }

}