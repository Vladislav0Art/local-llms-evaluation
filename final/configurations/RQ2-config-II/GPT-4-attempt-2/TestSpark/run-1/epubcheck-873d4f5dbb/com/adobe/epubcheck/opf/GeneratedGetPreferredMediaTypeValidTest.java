package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.ValidationContext;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetPreferredMediaTypeValidTest {

    @Test
    public void getPreferredMediaTypeValidTest() {
        String type = "audio/mpeg";
        Assert.assertEquals(type, OPFChecker30.getPreferredMediaType(type, "/audio.mp3"));
    }

}