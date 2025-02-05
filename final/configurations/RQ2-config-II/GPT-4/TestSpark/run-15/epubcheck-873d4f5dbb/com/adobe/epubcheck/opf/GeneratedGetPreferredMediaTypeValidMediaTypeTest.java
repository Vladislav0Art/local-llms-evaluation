package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetPreferredMediaTypeValidMediaTypeTest {

    //isAudioType tests

    @Test
    public void getPreferredMediaTypeValidMediaTypeTest() {
        assertEquals("audio/mpeg", OPFChecker30.getPreferredMediaType("audio/mpeg", "file.mp3"));
    }

}