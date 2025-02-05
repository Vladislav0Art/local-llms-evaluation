package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsCommonVideoTypeInValidTypeTest {

    @Test
    public void isCommonVideoTypeInValidTypeTest() {
        assertFalse(OPFChecker30.isCommonVideoType("video/xyz"));
    }

}