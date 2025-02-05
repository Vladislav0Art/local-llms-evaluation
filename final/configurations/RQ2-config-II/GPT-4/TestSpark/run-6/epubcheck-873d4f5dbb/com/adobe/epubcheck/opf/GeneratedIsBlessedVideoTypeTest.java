package com.adobe.epubcheck.opf;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import com.adobe.epubcheck.opf.ValidationContext;
import com.adobe.epubcheck.api.EPUBProfile;

public class GeneratedIsBlessedVideoTypeTest {

    @Test
    public void isBlessedVideoTypeTest() {
        Assert.assertFalse(OPFChecker30.isBlessedVideoType("application/pdf"));
        Assert.assertTrue(OPFChecker30.isBlessedVideoType("video/mp4"));
    }

}