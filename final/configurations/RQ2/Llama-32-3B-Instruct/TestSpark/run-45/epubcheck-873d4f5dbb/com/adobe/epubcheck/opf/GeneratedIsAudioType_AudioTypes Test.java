package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedIsAudioType_AudioTypes Test {

    @Test
    public void isAudioType_AudioTypes

    Test() {
        assertTrue(OPFChecker30.isAudioType("audio"));
        assertFalse(OPFChecker30.isAudioType("video"));
    }

}