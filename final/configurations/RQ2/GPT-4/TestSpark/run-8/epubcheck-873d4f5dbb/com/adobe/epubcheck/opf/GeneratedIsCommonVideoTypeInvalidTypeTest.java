package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsCommonVideoTypeInvalidTypeTest {

    @Test
    public void isCommonVideoTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isCommonVideoType("video/invalid"));
    }

}