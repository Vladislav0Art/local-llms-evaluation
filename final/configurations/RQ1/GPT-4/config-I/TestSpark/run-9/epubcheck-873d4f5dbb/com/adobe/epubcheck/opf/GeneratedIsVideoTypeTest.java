package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.ValidationContext;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.messages.MessageId;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.*;

public class GeneratedIsVideoTypeTest {

    @Test
    public void isVideoTypeTest() {
        String type = "video/test";
        Assert.assertTrue(OPFChecker30.isVideoType(type));
    }

}