package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsCommonVideoTypeInvalidVideoTypeTest {

    @Test
    public void isCommonVideoTypeInvalidVideoTypeTest() {
        Assert.assertFalse(OPFChecker30.isCommonVideoType("invalid/video"));
    }

}