package com.adobe.epubcheck.opf;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import com.adobe.epubcheck.opf.ValidationContext;
import com.adobe.epubcheck.api.EPUBProfile;

public class GeneratedIsBlessedFontTypeTest {

    @Test
    public void isBlessedFontTypeTest() {
        Assert.assertTrue(OPFChecker30.isBlessedFontType("application/font-woff"));
        Assert.assertFalse(OPFChecker30.isBlessedFontType("video/mp4"));
    }

}