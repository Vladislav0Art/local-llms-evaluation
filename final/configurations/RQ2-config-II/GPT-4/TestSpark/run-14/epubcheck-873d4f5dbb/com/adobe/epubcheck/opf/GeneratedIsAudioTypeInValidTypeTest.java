package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsAudioTypeInValidTypeTest {

    @Test
    public void isAudioTypeInValidTypeTest() {
        assertFalse(OPFChecker30.isAudioType("audio/xyz"));
    }

}