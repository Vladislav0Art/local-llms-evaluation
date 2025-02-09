package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlessedVideoTypeFalseTest {

    @Test
    public void isBlessedVideoTypeFalseTest() {
        assertFalse(OPFChecker30.isBlessedVideoType("video/invalid"));
    }

}