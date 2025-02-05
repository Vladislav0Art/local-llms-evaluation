package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsCommonVideoTypeInvalidTypeTest {

    @Test
    public void isCommonVideoTypeInvalidTypeTest() {
        assertFalse(OPFChecker30.isCommonVideoType("text/plain"));
    }

}