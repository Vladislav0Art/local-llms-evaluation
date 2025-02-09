package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

public class GeneratedIsCommonVideoTypeInvalidVideoTest {

    @Test
    public void isCommonVideoTypeInvalidVideoTest() {
        assertFalse(OPFChecker30.isCommonVideoType("video/mpeg"));
    }

}