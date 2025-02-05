package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetPreferredMediaTypeInvalidMediaTypeTest {

    //isAudioType tests

    @Test
    public void getPreferredMediaTypeInvalidMediaTypeTest() {
        assertNotEquals("audio/mpeg", OPFChecker30.getPreferredMediaType("video/mp4", "file.mp4"));
    }

}