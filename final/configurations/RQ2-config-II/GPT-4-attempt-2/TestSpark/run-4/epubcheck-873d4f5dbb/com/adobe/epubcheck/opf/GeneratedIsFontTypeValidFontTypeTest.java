package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsFontTypeValidFontTypeTest {

    @Test
    public void isFontTypeValidFontTypeTest() {
        Assert.assertTrue(OPFChecker30.isFontType("font/ttf"));
    }

}