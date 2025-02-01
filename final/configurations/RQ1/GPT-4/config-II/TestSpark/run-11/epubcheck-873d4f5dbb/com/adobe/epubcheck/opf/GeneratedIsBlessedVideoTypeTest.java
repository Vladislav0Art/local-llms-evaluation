package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.api.ValidationContext;

public class GeneratedIsBlessedVideoTypeTest {

    @Test
    public void isBlessedVideoTypeTest() {
        assertTrue(OPFChecker30.isBlessedVideoType("video/mp4"));
        assertTrue(OPFChecker30.isBlessedVideoType("video/ogg"));
    }

}