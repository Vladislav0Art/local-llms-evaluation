package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.mockito.Mockito.*;

import com.adobe.epubcheck.api.ValidationContext;
import org.junit.Assert;
import com.adobe.epubcheck.util.CheckingReport;
import com.adobe.epubcheck.util.FeatureEnum;
import com.adobe.epubcheck.messages.MessageId;
import io.mola.galimatias.URL;
import com.adobe.epubcheck.api.FeatureReport;

import java.util.Collections;

public class GeneratedGetPreferredMediaTypeTest {

    @Test
    public void getPreferredMediaTypeTest() {
        Assert.assertEquals("font/otf", OPFChecker30.getPreferredMediaType("application/font-sfnt", "test.otf"));
        Assert.assertEquals("font/ttf", OPFChecker30.getPreferredMediaType("application/font-sfnt", "test.ttf"));
        Assert.assertNull(OPFChecker30.getPreferredMediaType("application/form-sdnt", "test.ttf"));
    }

}