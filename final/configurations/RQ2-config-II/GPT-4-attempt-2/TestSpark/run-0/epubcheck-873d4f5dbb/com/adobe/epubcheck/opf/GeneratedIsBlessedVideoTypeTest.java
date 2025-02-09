package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsBlessedVideoTypeTest {

    @Test
    public void isBlessedVideoTypeTest() {
        OPFChecker30 checker30 = new OPFChecker30(null);
        boolean result = checker30.isBlessedVideoType("video/mp4");
        assertTrue(result);
    }

}