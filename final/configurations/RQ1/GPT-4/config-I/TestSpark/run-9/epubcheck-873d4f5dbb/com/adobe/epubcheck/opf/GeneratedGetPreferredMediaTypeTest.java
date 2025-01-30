package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.messages.MessageId;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.CheckUtil.ValidationContextProperties;
import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.*;

public class GeneratedGetPreferredMediaTypeTest {

    @Test
    public void getPreferredMediaTypeTest() {
        String type = "application/font-sfnt";
        String path = "test.otf";
        Assert.assertEquals("font/otf", OPFChecker30.getPreferredMediaType(type, path));
    }

}