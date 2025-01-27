package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;

public class GeneratedIsAudioType_validType_ReturnsTrue {

    @Test
    public void isAudioType_validType_ReturnsTrue() {
        String type = "audio/mp3";
        boolean result = OPFChecker30.isAudioType(type);
        assertTrue(result);
    }

}