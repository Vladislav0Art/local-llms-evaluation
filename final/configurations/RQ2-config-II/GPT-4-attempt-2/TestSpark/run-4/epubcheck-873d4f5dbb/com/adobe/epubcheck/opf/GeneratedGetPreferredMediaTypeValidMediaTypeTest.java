package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetPreferredMediaTypeValidMediaTypeTest {

    @Test
    public void getPreferredMediaTypeValidMediaTypeTest() {
        Assert.assertEquals("application/xhtml+xml+zip", OPFChecker30.getPreferredMediaType("application/xhtml+xml", "test.zip"));
    }

}