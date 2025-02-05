package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.mockito.Mockito;
import org.junit.Assert;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;

public class GeneratedIsVideoTypeValidTypeTest {

    @Test
    public void isVideoTypeValidTypeTest() {
        Assert.assertTrue(OPFChecker30.isVideoType("video/mpeg"));
    }

}