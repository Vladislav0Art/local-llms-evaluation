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

public class GeneratedIsFontTypeTest {

    @Test
    public void isFontTypeTest() {
        Assert.assertTrue(OPFChecker30.isFontType("font/otf"));
        Assert.assertFalse(OPFChecker30.isFontType("video/mpeg"));
    }

}