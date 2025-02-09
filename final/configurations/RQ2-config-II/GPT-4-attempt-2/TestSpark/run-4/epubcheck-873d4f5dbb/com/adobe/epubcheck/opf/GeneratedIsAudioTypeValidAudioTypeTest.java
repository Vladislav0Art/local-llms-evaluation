package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsAudioTypeValidAudioTypeTest {

    @Test
    public void isAudioTypeValidAudioTypeTest() {
        Assert.assertTrue(OPFChecker30.isAudioType("audio/mpeg"));
    }

}