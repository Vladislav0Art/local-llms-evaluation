package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsVideoTypeValidVideoTypeTest {

    @Test
    public void isVideoTypeValidVideoTypeTest() {
        Assert.assertTrue(OPFChecker30.isVideoType("video/mpeg"));
    }

}