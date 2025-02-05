package com.adobe.epubcheck.opf;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import com.adobe.epubcheck.opf.ValidationContext;
import com.adobe.epubcheck.api.EPUBProfile;

public class GeneratedIsCommonVideoTypeTest {

    @Test
    public void isCommonVideoTypeTest() {
        Assert.assertTrue(OPFChecker30.isCommonVideoType("video/mp4"));
        Assert.assertFalse(OPFChecker30.isCommonVideoType("audio/mpeg"));
    }

}