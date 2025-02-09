package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsFontTypeInvalidFontTypeTest {

    @Test
    public void isFontTypeInvalidFontTypeTest() {
        Assert.assertFalse(OPFChecker30.isFontType("invalid/font"));
    }

}