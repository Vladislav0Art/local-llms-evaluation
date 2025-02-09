package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

public class GeneratedIsAudioTypeInvalidAudioTest {

    @Test
    public void isAudioTypeInvalidAudioTest() {
        assertFalse(OPFChecker30.isAudioType("video/mp4"));
    }

}