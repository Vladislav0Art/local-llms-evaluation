package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFHandler30;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedGetPreferredMediaTypeTest {

    @Test
    public void getPreferredMediaTypeTest() {
        String mediaType = OPFChecker30.getPreferredMediaType("application/font-sfnt", "test.ttf");
        Assert.assertEquals("font/ttf", mediaType);

        mediaType = OPFChecker30.getPreferredMediaType("application/font-sfnt", "test.otf");
        Assert.assertEquals("font/otf", mediaType);

        mediaType = OPFChecker30.getPreferredMediaType("text/javascript", "app.js");
        Assert.assertEquals("application/javascript", mediaType);
    }

}