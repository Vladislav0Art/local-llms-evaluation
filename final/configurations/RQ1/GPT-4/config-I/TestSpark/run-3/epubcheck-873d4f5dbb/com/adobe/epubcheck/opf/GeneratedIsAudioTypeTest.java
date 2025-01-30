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

public class GeneratedIsAudioTypeTest {

    @Test
    public void isAudioTypeTest() {
        Assert.assertTrue(OPFChecker30.isAudioType("audio/mpeg"));
        Assert.assertFalse(OPFChecker30.isAudioType("video/mp4"));
    }

}