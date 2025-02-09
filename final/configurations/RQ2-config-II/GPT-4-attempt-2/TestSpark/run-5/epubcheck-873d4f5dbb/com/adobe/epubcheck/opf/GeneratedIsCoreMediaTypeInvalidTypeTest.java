package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsCoreMediaTypeInvalidTypeTest {

    @Test
    public void isCoreMediaTypeInvalidTypeTest() {
        Assert.assertFalse(OPFChecker30.isCoreMediaType("image/not-a-core-media"));
    }

}