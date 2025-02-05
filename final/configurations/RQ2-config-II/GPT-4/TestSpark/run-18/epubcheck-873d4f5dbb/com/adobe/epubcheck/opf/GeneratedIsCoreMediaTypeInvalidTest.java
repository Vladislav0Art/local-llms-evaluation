package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsCoreMediaTypeInvalidTest {

    @Test
    public void isCoreMediaTypeInvalidTest() {
        assertFalse(OPFChecker30.isCoreMediaType("video/mp3"));
    }

}