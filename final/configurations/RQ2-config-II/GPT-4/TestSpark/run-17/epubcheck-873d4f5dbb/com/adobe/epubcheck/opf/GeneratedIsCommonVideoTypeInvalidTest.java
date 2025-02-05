package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsCommonVideoTypeInvalidTest {

    @Test
    public void isCommonVideoTypeInvalidTest() {
        assertFalse(OPFChecker30.isCommonVideoType("audio/mp4"));
    }

}