package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.messages.MessageId;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.url.URLFragment;
import com.adobe.epubcheck.util.FeatureEnum;
import com.adobe.epubcheck.api.FeatureReport.Feature;
import com.adobe.epubcheck.vocab.PublicationType;
import io.mola.galimatias.URL;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Optional;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedCheckPackageEmptyValidationContextTest {

    @Test
    public void checkPackageEmptyValidationContextTest() {
        OPFChecker30 checker = new OPFChecker30(new ValidationContext());
        assertFalse(checker.checkPackage());
    }

}