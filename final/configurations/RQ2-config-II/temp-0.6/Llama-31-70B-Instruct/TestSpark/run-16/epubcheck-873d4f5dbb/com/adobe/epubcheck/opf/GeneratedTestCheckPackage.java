package com.adobe.epubcheck.opf;

import java.util.Set;

import org.w3c.epubcheck.core.references.Reference;
import org.w3c.epubcheck.util.url.URLFragment;
import com.adobe.epubcheck.api.EPUBLocation;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.FeatureReport.Feature;
import com.adobe.epubcheck.messages.MessageId;
import com.adobe.epubcheck.opf.MetadataSet.Metadata;
import com.adobe.epubcheck.opf.ResourceCollection.Roles;
import com.adobe.epubcheck.overlay.OverlayTextChecker;
import com.adobe.epubcheck.overlay.SmilClock;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.FeatureEnum;
import com.adobe.epubcheck.vocab.DCMESVocab;
import com.adobe.epubcheck.vocab.MediaOverlaysVocab;
import com.adobe.epubcheck.vocab.PackageVocabs;
import com.google.common.base.Optional;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import io.mola.galimatias.URL;

public class GeneratedTestCheckPackage {

    @Test
    public void testCheckPackage() {
        OPFChecker30 opfChecker30 = new OPFChecker30(new ValidationContext());
        boolean actual = opfChecker30.checkPackage();
        // TODO: Add assertion
    }

}