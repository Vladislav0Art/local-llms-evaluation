package com.adobe.epubcheck.opf;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import com.adobe.epubcheck.opf.ValidationContext;
import com.adobe.epubcheck.api.EPUBProfile;

public class GeneratedIsFontTypeTest {

    @Test
    public void isFontTypeTest() {
        Assert.assertTrue(OPFChecker30.isFontType("application/font-woff"));
        Assert.assertFalse(OPFChecker30.isFontType("audio/mpeg"));
    }

}