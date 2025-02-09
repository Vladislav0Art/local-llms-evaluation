package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedIsBlessedVideoTypeTestForUnsupportedType {

    @Test
    public void isBlessedVideoTypeTestForUnsupportedType() {
        assertFalse(OPFChecker30.isBlessedVideoType("video/avi"));
    }

}