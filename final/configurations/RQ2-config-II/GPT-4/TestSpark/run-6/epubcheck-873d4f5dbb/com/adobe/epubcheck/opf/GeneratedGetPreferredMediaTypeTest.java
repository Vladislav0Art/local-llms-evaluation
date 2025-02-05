package com.adobe.epubcheck.opf;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import com.adobe.epubcheck.opf.ValidationContext;
import com.adobe.epubcheck.api.EPUBProfile;

public class GeneratedGetPreferredMediaTypeTest {

    @Test
    public void getPreferredMediaTypeTest() {
        Assert.assertEquals("application/xhtml+xml", OPFChecker30.getPreferredMediaType("application/xhtml+xml", "test.xhtml"));
        Assert.assertEquals("application/x-dtbook+xml", OPFChecker30.getPreferredMediaType("application/xhtml+xml", "test.dtbook"));
        Assert.assertEquals("text/css", OPFChecker30.getPreferredMediaType("text/css", "test.css"));
    }

}