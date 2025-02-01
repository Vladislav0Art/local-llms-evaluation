package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.FeatureReport.FeatureEnum;
import com.adobe.epubcheck.messages.MessageId;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.util.FeatureEnum;
import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsBlessedAudioTypeTest {

    @Mock
    private ValidationContext mockedContext;

    @Mock
    private OPFItem mockedItem;

    @Mock
    private OPFHandler mockedHandler;

    @Test
    public void isBlessedAudioTypeTest() {
        boolean result = OPFChecker30.isBlessedAudioType("audio/mp4");
        assertTrue(result);
    }

}