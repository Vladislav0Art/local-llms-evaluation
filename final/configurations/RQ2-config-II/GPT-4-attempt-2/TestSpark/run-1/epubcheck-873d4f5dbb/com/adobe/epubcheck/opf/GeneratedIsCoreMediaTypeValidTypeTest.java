package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.ValidationContext;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsCoreMediaTypeValidTypeTest {

    @Test
    public void isCoreMediaTypeValidTypeTest() {
        Assert.assertTrue(OPFChecker30.isCoreMediaType("application/xhtml+xml"));
    }

}