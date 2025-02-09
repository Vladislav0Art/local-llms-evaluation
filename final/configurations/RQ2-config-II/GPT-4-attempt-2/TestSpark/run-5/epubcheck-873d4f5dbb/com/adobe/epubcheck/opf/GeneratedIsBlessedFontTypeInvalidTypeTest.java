package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlessedFontTypeInvalidTypeTest {

    @Test
    public void isBlessedFontTypeInvalidTypeTest() {
        Assert.assertFalse(OPFChecker30.isBlessedFontType("application/not-a-font"));
    }

}