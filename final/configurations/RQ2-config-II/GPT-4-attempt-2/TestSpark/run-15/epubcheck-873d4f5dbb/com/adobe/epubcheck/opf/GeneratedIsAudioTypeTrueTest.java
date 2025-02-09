package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsAudioTypeTrueTest {

    @Test
    public void isAudioTypeTrueTest() {
        assertTrue(OPFChecker30.isAudioType("audio/mpeg"));
    }

}