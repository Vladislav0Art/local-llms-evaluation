package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedIsCommonVideoTypeNotFoundTest {

    @Test
    public void isCommonVideoTypeNotFoundTest() {
        assertFalse(OPFChecker30.isCommonVideoType("unknownType"));
    }

}