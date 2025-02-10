package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedIsCommonVideoType_CommonVideoTypes Test {

    @Test
    public void isCommonVideoType_CommonVideoTypes

    Test() {
        assertTrue(OPFChecker30.isCommonVideoType("common video"));
        assertFalse(OPFChecker30.isCommonVideoType("blessed common video"));
    }

}