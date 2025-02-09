package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

public class GeneratedIsAudioTypeValidAudioTest {

    @Test
    public void isAudioTypeValidAudioTest() {
        assertTrue(OPFChecker30.isAudioType("audio/mp3"));
    }

}