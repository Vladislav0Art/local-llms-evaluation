package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlessedAudioTypeValidAudioTypeTest {

    @Test
    public void isBlessedAudioTypeValidAudioTypeTest() {
        Assert.assertTrue(OPFChecker30.isBlessedAudioType("audio/mp4"));
    }

}