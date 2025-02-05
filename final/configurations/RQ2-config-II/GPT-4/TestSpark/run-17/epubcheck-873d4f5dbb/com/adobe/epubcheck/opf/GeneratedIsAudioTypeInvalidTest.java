package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsAudioTypeInvalidTest {

    @Test
    public void isAudioTypeInvalidTest() {
        assertFalse(OPFChecker30.isAudioType("video/mpeg"));
    }

}