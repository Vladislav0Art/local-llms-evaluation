package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem;
import org.mockito.Mockito;

public class GeneratedIsVideoTypeTest {

    @Test
    public void isVideoTypeTest() {
        assertFalse(OPFChecker30.isVideoType("wrongType"));
        assertTrue(OPFChecker30.isVideoType("video/mp4"));
    }

}