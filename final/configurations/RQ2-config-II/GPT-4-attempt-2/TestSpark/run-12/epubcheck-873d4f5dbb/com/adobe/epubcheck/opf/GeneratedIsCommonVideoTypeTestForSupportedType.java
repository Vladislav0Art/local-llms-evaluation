package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedIsCommonVideoTypeTestForSupportedType {

    @Test
    public void isCommonVideoTypeTestForSupportedType() {
        assertTrue(OPFChecker30.isCommonVideoType("video/x-matroska"));
    }

}