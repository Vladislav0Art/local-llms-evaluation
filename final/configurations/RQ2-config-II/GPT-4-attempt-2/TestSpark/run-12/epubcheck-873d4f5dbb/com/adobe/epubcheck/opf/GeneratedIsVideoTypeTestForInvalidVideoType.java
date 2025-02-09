package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedIsVideoTypeTestForInvalidVideoType {

    @Test
    public void isVideoTypeTestForInvalidVideoType() {
        assertFalse(OPFChecker30.isVideoType("text/plain"));
    }

}