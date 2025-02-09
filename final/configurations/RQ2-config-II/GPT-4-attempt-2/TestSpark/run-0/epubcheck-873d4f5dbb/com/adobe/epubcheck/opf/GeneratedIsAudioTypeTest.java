package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsAudioTypeTest {

    @Test
    public void isAudioTypeTest() {
        OPFChecker30 checker30 = new OPFChecker30(null);
        boolean result = checker30.isAudioType("audio/mpeg");
        assertTrue(result);
    }

}