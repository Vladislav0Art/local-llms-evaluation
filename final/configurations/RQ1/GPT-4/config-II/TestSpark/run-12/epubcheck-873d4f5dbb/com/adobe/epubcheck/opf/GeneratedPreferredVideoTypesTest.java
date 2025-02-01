package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.AbstractEpubCheck;
import com.adobe.epubcheck.api.AbstractTest;
import com.adobe.epubcheck.api.FeatureReport;
import com.adobe.epubcheck.api.FeatureReport.Feature;
import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.api.ValidationContext.ValidationContextBuilder;
import com.adobe.epubcheck.api.ValidationReport;
import com.adobe.epubcheck.messages.MessageId;
import com.google.common.base.Function;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.adobe.epubcheck.opf.DocumentValidatorFactory;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.util.*;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static com.adobe.epubcheck.api.EPUBProfile.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.HashMap;

public class GeneratedPreferredVideoTypesTest {

    private static final String TEST_FILES_DIR = "/30/expanded/";

    private Function<MessageId, String> defaultExpectedError = new Function<MessageId, String>() {
        public String apply(MessageId id) {
            return String.format("ERROR(RSC-005): test.epub/%s(%d,%d): %s.", id.toString());
        }
    };

    private ValidationReport testValidateDocument(String fileName) {
        ValidationContext context = new ValidationContextBuilder().path(fileName).mimetype(
                        MIME_TYPE_EPUB).profile(EPUBProfile.DEFAULT)
                .build();
        return new EpubCheck(context).validate();
    }

    @Test
    public void preferredVideoTypesTest() {
        boolean isVideoTypeFalse = OPFChecker30.isVideoType("image/png");
        boolean isVideoTypeTrue = OPFChecker30.isVideoType("video/mp4");
        boolean isBlessedVideoTypeFalse = OPFChecker30.isBlessedVideoType("video/3gpp2");
        boolean isBlessedVideoTypeTrue = OPFChecker30.isBlessedVideoType("video/mp4");

        Assert.assertEquals(false, isVideoTypeFalse);
        Assert.assertEquals(true, isVideoTypeTrue);
        Assert.assertEquals(false, isBlessedVideoTypeFalse);
        Assert.assertEquals(true, isBlessedVideoTypeTrue);
    }

}