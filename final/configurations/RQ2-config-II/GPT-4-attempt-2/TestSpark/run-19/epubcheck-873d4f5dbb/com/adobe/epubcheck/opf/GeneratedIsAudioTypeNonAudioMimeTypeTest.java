package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsAudioTypeNonAudioMimeTypeTest {

    @Test
    public void isAudioTypeNonAudioMimeTypeTest() {
        assertFalse(OPFChecker30.isAudioType("text/plain"));
    }

}