package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlessedAudioTypeInvalidAudioTypeTest {

    @Test
    public void isBlessedAudioTypeInvalidAudioTypeTest() {
        Assert.assertFalse(OPFChecker30.isBlessedAudioType("invalid/audio"));
    }

}