package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.mockito.Mockito;
import org.junit.Assert;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;

public class GeneratedGetPreferredMediaTypeValidTypeTest {

    @Test
    public void getPreferredMediaTypeValidTypeTest() {
        Assert.assertEquals(OPFChecker30.getPreferredMediaType("image/jpeg", "test.jpg"), "image/jpeg");
    }

}