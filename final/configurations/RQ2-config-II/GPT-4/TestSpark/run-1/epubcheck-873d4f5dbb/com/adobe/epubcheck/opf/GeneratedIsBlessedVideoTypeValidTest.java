package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlessedVideoTypeValidTest {

    @Test
    public void isBlessedVideoTypeValidTest() {
        assertTrue(OPFChecker30.isBlessedVideoType("video/mp4"));
    }

}