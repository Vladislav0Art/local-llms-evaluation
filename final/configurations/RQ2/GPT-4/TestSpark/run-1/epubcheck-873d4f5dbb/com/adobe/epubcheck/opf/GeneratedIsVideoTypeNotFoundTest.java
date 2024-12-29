package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedIsVideoTypeNotFoundTest {

    @Test
    public void isVideoTypeNotFoundTest() {
        assertFalse(OPFChecker30.isVideoType("unknownType"));
    }

}