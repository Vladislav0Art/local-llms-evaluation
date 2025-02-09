package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetPreferredMediaTypeInvalidMediaTypeTest {

    @Test
    public void getPreferredMediaTypeInvalidMediaTypeTest() {
        Assert.assertEquals("invalid/media", OPFChecker30.getPreferredMediaType("invalid/media", "test.zip"));
    }

}