package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsBlessedAudioTypeFalseTest {

    @Test
    public void isBlessedAudioTypeFalseTest() {
        assertFalse(OPFChecker30.isBlessedAudioType("audio/mpeg"));
    }

}