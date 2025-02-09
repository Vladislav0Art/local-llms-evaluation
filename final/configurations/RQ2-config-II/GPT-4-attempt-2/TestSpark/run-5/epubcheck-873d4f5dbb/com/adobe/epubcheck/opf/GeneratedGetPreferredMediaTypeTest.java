package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetPreferredMediaTypeTest {

    @Test
    public void getPreferredMediaTypeTest() {
        Assert.assertEquals("image/png",
                OPFChecker30.getPreferredMediaType("image/png", "image-path.png"));
    }

}