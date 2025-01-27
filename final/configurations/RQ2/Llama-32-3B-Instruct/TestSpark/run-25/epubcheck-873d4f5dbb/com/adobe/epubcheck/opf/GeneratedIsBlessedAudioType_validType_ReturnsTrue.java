package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;

public class GeneratedIsBlessedAudioType_validType_ReturnsTrue {

    @Test
    public void isBlessedAudioType_validType_ReturnsTrue() {
        String type = "blessed audio/mp3";
        boolean result = OPFChecker30.isBlessedAudioType(type);
        assertTrue(result);
    }

}