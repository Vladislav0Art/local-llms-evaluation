package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.w3c.epubcheck.api.EPUBLocation;
import org.w3c.epubcheck.api.EPUBProfile;
import org.w3c.epubcheck.api.FeatureReport.Feature;
import org.w3c.epubcheck.core.references.Reference;
import org.w3c.epubcheck.util.url.URLFragment;
import org.w3c.epubcheck.vocab.DCMESVocab;
import org.w3c.epubcheck.vocab.MediaOverlaysVocab;
import org.w3c.epubcheck.vocab.PackageVocabs;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(PowerMockito.class)
public class GeneratedIsVideoTypeReturnsFalse {

    @Mock
    private ValidationContext validationContext;

    @Mock
    private EPUBProfile epubProfile;

    @Mock
    private Reference reference;

    @Mock
    private URLFragment urlFragment;

    @Mock
    private EPUBLocation location;

    @Mock
    private FeatureReport.Feature feature;

    @Test
    public void isVideoTypeReturnsFalse() {
        assertTrue(!OPFChecker30.isVideoType("image"));
    }

}