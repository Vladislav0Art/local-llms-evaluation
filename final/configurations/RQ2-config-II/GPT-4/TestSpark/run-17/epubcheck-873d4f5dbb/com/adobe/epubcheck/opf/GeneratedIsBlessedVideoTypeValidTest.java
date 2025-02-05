package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsBlessedVideoTypeValidTest {

    @Test
    public void isBlessedVideoTypeValidTest() {
        assertTrue(OPFChecker30.isBlessedVideoType("video/mp4"));
    }

}