package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsCommonVideoTypeInvalidMediaTypeTest {

    //isAudioType tests

    @Test
    public void isCommonVideoTypeInvalidMediaTypeTest() {
        assertFalse(OPFChecker30.isCommonVideoType("application/octet-stream"));
    }

}