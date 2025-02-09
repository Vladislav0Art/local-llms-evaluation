package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsCommonVideoTypeValidVideoTypeTest {

    @Test
    public void isCommonVideoTypeValidVideoTypeTest() {
        Assert.assertTrue(OPFChecker30.isCommonVideoType("video/mp4"));
    }

}