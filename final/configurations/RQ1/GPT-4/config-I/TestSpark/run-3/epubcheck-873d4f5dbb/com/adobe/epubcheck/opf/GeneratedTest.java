package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFHandler30;
import com.adobe.epubcheck.opf.OPFItem;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void isAudioTypeTest() {
        Assert.assertTrue(OPFChecker30.isAudioType("audio/mpeg"));
        Assert.assertFalse(OPFChecker30.isAudioType("video/mp4"));
    }

    @Test
    public void isBlessedAudioTypeTest() {
        Assert.assertTrue(OPFChecker30.isBlessedAudioType("audio/mpeg"));
        Assert.assertFalse(OPFChecker30.isBlessedAudioType("audio/mp3"));
    }

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