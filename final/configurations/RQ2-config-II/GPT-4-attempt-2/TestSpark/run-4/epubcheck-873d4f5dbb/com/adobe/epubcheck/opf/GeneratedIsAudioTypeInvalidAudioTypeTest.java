package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsAudioTypeInvalidAudioTypeTest {

    @Test
    public void isAudioTypeInvalidAudioTypeTest() {
        Assert.assertFalse(OPFChecker30.isAudioType("invalid/audio"));
    }

}