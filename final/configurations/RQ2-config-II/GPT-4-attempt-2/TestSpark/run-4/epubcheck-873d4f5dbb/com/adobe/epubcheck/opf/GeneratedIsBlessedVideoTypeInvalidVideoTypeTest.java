package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlessedVideoTypeInvalidVideoTypeTest {

    @Test
    public void isBlessedVideoTypeInvalidVideoTypeTest() {
        Assert.assertFalse(OPFChecker30.isBlessedVideoType("invalid/video"));
    }

}