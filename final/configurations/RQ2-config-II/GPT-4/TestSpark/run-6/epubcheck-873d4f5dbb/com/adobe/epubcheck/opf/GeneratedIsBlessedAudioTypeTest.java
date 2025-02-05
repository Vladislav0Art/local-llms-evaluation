package com.adobe.epubcheck.opf;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import com.adobe.epubcheck.opf.ValidationContext;
import com.adobe.epubcheck.api.EPUBProfile;

public class GeneratedIsBlessedAudioTypeTest {

    @Test
    public void isBlessedAudioTypeTest() {
        Assert.assertTrue(OPFChecker30.isBlessedAudioType("audio/mpeg"));
        Assert.assertFalse(OPFChecker30.isBlessedAudioType("video/mpeg"));
    }

}