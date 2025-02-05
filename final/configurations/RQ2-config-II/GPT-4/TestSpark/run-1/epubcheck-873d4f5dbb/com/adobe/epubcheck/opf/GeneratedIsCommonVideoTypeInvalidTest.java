package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsCommonVideoTypeInvalidTest {

    @Test
    public void isCommonVideoTypeInvalidTest() {
        assertFalse(OPFChecker30.isCommonVideoType("text/html"));
    }

}