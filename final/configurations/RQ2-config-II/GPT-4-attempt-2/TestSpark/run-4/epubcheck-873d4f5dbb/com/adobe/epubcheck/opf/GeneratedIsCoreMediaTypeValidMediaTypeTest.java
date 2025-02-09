package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsCoreMediaTypeValidMediaTypeTest {

    @Test
    public void isCoreMediaTypeValidMediaTypeTest() {
        Assert.assertTrue(OPFChecker30.isCoreMediaType("application/xhtml+xml"));
    }

}