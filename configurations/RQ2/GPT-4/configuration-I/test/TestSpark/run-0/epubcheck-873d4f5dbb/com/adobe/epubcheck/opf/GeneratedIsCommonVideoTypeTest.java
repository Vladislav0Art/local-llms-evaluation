package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem;
import org.mockito.Mockito;

public class GeneratedIsCommonVideoTypeTest {

    @Test
    public void isCommonVideoTypeTest() {
        assertFalse(OPFChecker30.isCommonVideoType("wrongType"));
        assertTrue(OPFChecker30.isCommonVideoType("video/mp4"));
    }

}