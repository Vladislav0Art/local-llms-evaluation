package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import com.adobe.epubcheck.api.EPUBLocation;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.FeatureReport.Feature;
import com.adobe.epubcheck.messages.MessageId;
import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.util.EPUBVersion;
import com.google.common.base.Optional;
import com.google.common.base.Strings;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckContentTest_ReturnsTrue {

    @InjectMocks
    private OPFChecker30 opfChecker30;

    @Test
    public void checkContentTest_ReturnsTrue() {
        // Test that checkContent returns true
        assertTrue(opfChecker30.checkContent());
    }

}