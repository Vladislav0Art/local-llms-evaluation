package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsCommonVideoTypeTrueTest {

    @Test
    public void isCommonVideoTypeTrueTest() {
        assertTrue(OPFChecker30.isCommonVideoType("video/mp4"));
    }

}