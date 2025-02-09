package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsBlessedVideoTypeFalseTest {

    @Test
    public void isBlessedVideoTypeFalseTest() {
        assertFalse(OPFChecker30.isBlessedVideoType("video/mpeg"));
    }

}