package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.mockito.Mockito;
import org.junit.Assert;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;

public class GeneratedIsFontTypeValidTypeTest {

    @Test
    public void isFontTypeValidTypeTest() {
        Assert.assertTrue(OPFChecker30.isFontType("application/font-woff"));
    }

}