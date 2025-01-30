package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.core.EPUBProfile;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.api.Report;
import io.mola.galimatias.URL;
import io.mola.galimatias.MalformedURLException;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import java.io.IOException;

public class GeneratedIsVideoTypeInvalidTest {

    @Test
    public void isVideoTypeInvalidTest() {
        boolean result = OPFChecker30.isVideoType("audio/sampleVideo");
        Assert.assertFalse(result);
    }

}