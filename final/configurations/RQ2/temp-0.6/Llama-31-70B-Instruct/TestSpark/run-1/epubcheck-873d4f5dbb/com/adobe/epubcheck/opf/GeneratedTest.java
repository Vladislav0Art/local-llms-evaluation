package com.adobe.epubcheck.opf;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.EPUBVersion;
import com.adobe.epubcheck.opf.MetadataSet.Metadata;
import com.adobe.epubcheck.opf.ResourceCollection.Roles;
import com.adobe.epubcheck.util.EPUBLocation;
import com.adobe.epubcheck.util.FeatureEnum;
import com.adobe.epubcheck.vocab.DCMESVocab;
import com.adobe.epubcheck.vocab.MediaOverlaysVocab;
import com.adobe.epubcheck.vocab.PackageVocabs;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import io.mola.galimatias.URL;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    private OPFChecker30 opfChecker30;

    @Before
    public void before() {
        opfChecker30 = new OPFChecker30(mock(ValidationContext.class));
    }

    @Test
    public void checkPackageTest() {
        assertTrue(opfChecker30.checkPackage());
    }

    @Test
    public void checkContentTest() {
        assertTrue(opfChecker30.checkContent());
    }

}