package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

public class GeneratedIsBlessedVideoTypeInvalidVideoTest {

    @Test
    public void isBlessedVideoTypeInvalidVideoTest() {
        assertFalse(OPFChecker30.isBlessedVideoType("video/avi"));
    }

}