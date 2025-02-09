package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlessedVideoTypeValidVideoTypeTest {

    @Test
    public void isBlessedVideoTypeValidVideoTypeTest() {
        Assert.assertTrue(OPFChecker30.isBlessedVideoType("video/mp4"));
    }

}