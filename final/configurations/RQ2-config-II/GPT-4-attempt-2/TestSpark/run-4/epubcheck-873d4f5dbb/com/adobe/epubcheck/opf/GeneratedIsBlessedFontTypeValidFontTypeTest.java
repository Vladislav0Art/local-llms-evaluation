package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlessedFontTypeValidFontTypeTest {

    @Test
    public void isBlessedFontTypeValidFontTypeTest() {
        Assert.assertTrue(OPFChecker30.isBlessedFontType("font/ttf"));
    }

}