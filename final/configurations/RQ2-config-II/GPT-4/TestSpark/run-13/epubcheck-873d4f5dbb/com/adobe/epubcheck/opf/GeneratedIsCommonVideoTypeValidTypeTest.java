package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsCommonVideoTypeValidTypeTest {

    @Test
    public void isCommonVideoTypeValidTypeTest() {
        assertTrue(OPFChecker30.isCommonVideoType("video/webm"));
    }

}