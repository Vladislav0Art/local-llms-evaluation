package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.ValidationContext;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsCoreMediaTypeInvalidTypeTest {

    @Test
    public void isCoreMediaTypeInvalidTypeTest() {
        Assert.assertFalse(OPFChecker30.isCoreMediaType("text/css"));
    }

}