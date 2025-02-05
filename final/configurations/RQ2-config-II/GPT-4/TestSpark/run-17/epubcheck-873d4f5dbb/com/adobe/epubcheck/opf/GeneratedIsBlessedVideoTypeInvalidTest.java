package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsBlessedVideoTypeInvalidTest {

    @Test
    public void isBlessedVideoTypeInvalidTest() {
        assertFalse(OPFChecker30.isBlessedVideoType("audio/mp4"));
    }

}