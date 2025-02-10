package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedIsBlessedAudioType_BlessedAudioTypes Test {

    @Test
    public void isBlessedAudioType_BlessedAudioTypes

    Test() {
        assertTrue(OPFChecker30.isBlessedAudioType("blessed audio"));
        assertFalse(OPFChecker30.isBlessedAudioType("audio"));
    }

}