package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsAudioTypeValidTest {

    @Test
    public void isAudioTypeValidTest() {
        assertTrue(OPFChecker30.isAudioType("audio/mpeg"));
    }

}