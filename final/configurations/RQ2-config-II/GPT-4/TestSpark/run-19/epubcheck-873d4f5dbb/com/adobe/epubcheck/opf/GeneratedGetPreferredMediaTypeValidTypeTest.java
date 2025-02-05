package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedGetPreferredMediaTypeValidTypeTest {

    @Test
    public void getPreferredMediaTypeValidTypeTest() {
        Assert.assertEquals("audio/mpeg", OPFChecker30.getPreferredMediaType("audio/mp3", "audioPath.mp3"));
    }

}