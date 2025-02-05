package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsFontTypeInvalidTypeTest {

    @Test
    public void isFontTypeInvalidTypeTest() {
        Assert.assertFalse(OPFChecker30.isFontType("text/css"));
    }

}