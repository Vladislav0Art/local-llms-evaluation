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

public class GeneratedPreferredAudioTypesTest {

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
    public void preferredAudioTypesTest() {
        boolean isAudioTypeFalse = OPFChecker30.isAudioType("image/png");
        boolean isAudioTypeTrue = OPFChecker30.isAudioType("audio/mp4");
        boolean isBlessedAudioTypeFalse = OPFChecker30.isBlessedAudioType("audio/basic");
        boolean isBlessedAudioTypeTrue = OPFChecker30.isBlessedAudioType("audio/mp4");

        Assert.assertEquals(false, isAudioTypeFalse);
        Assert.assertEquals(true, isAudioTypeTrue);
        Assert.assertEquals(false, isBlessedAudioTypeFalse);
        Assert.assertEquals(true, isBlessedAudioTypeTrue);
    }

}