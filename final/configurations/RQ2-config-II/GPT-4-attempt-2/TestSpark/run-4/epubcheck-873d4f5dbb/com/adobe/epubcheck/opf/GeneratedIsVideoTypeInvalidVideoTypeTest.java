package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsVideoTypeInvalidVideoTypeTest {

    @Test
    public void isVideoTypeInvalidVideoTypeTest() {
        Assert.assertFalse(OPFChecker30.isVideoType("invalid/video"));
    }

}