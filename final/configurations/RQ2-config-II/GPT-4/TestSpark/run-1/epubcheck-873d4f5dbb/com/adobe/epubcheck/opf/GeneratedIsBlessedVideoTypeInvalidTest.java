package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlessedVideoTypeInvalidTest {

    @Test
    public void isBlessedVideoTypeInvalidTest() {
        assertFalse(OPFChecker30.isBlessedVideoType("text/html"));
    }

}