package com.adobe.epubcheck.opf;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.adobe.epubcheck.api.EPUBLocation;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.opf.OPFData;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.PackageVocabs;
import com.adobe.epubcheck.vocab.MediaOverlaysVocab;
import com.adobe.epubcheck.vocab.PackageVocabs;
import com.google.common.base.Optional;
import org.junit.Test;
import org.w3c.epubcheck.core.EPUBVersion;
import org.w3c.epubcheck.core.EPUBProfile;
import org.w3c.epubcheck.core.Feature;

public class GeneratedTestInitHandler {

    private OPFChecker30 checker;

    @Before
    public void setUp() {
        checker = new OPFChecker30(mock(ValidationContext.class));
    }

    @Test
    public void testInitHandler() {
        OPFHandler handler = mock(OPFHandler.class);
        checker.initHandler(handler);
    }

}