package com.adobe.epubcheck.opf;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import com.adobe.epubcheck.opf.ValidationContext;
import com.adobe.epubcheck.api.EPUBProfile;

public class GeneratedIsVideoTypeTest {

    @Test
    public void isVideoTypeTest() {
        Assert.assertTrue(OPFChecker30.isVideoType("video/mpeg"));
        Assert.assertFalse(OPFChecker30.isVideoType("audio/mpeg"));
    }

}