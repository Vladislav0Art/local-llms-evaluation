package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.mockito.Mockito;
import org.junit.Assert;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;

public class GeneratedGetPreferredMediaTypeInvalidTypeTest {

    @Test
    public void getPreferredMediaTypeInvalidTypeTest() {
        Assert.assertEquals(OPFChecker30.getPreferredMediaType("invalid/type", "test.jpg"), "application/octet-stream");
    }

}