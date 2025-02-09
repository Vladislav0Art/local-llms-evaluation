package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsCommonVideoTypeUnCommonMimeTypeTest {

    @Test
    public void isCommonVideoTypeUnCommonMimeTypeTest() {
        assertFalse(OPFChecker30.isCommonVideoType("video/flv"));
    }

}