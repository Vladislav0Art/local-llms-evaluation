package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlessedFontTypeInvalidFontTypeTest {

    @Test
    public void isBlessedFontTypeInvalidFontTypeTest() {
        Assert.assertFalse(OPFChecker30.isBlessedFontType("invalid/font"));
    }

}