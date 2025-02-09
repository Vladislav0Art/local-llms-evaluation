package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsCoreMediaTypeInvalidMediaTypeTest {

    @Test
    public void isCoreMediaTypeInvalidMediaTypeTest() {
        Assert.assertFalse(OPFChecker30.isCoreMediaType("invalid/media"));
    }

}