package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.ValidationContext;
import com.adobe.epubcheck.messages.Message;
import com.adobe.epubcheck.messages.MessageId;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.util.FeatureReport;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsCOREMediaTypeTrueTest {

    @Mock
    private ValidationContext context;

    @Mock
    private OPFItem item;

    @Mock
    private OPFHandler opfHandler;

    @Mock
    private Report report;

    @Mock
    private FeatureReport featureReport;

    @Test
    public void isCOREMediaTypeTrueTest() {
        assertTrue(OPFChecker30.isCoreMediaType("audio/mpeg"));
    }

}