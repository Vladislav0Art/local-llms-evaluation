package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.Optional;
import java.net.URL;

import com.google.common.base.Predicate;
import com.adobe.epubcheck.api.EPUBLocation;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.FeatureReport.Feature;
import com.adobe.epubcheck.messages.MessageId;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedCheckContent_HasValidMetadata {

    @Test
    public void checkContent_HasValidMetadata() {
        ValidationContext context = new ValidationContext();
        OPFChecker30 checker = new OPFChecker30(context);
        Metadata metadata = new Metadata();
        assertTrue(checker.checkContent(metadata));
    }

}