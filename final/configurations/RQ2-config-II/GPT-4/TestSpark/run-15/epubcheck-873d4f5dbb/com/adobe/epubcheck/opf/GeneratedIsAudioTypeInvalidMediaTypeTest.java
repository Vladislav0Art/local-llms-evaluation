package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsAudioTypeInvalidMediaTypeTest {

    //isAudioType tests

    @Test
    public void isAudioTypeInvalidMediaTypeTest() {
        assertFalse(OPFChecker30.isAudioType("text/html"));
    }

}