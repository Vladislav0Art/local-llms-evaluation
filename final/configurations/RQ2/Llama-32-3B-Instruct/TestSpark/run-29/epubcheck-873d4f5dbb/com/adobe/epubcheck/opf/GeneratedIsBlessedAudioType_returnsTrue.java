package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedIsBlessedAudioType_returnsTrue {

    @Mock
    private ValidationContext validationContext;

    @Mock
    private EPUBLocation epubLocation;

    @Mock
    private FeatureReport.Feature featureReport;

    @Mock
    private MessageId messageId;

    @Mock
    private Reference reference;

    @Mock
    private URLFragment urlFragment;

    @Mock
    private Set<FeatureEnum> featuresSet;

    @Mock
    private Predicate<String> predicate;

    @Mock
    private Optional<String> optionalString;

    @Test
    public void isBlessedAudioType_returnsTrue() {
        // given
        when(featureReport.getMediaType()).thenReturn("audio");

        // when
        boolean result = OPFChecker30.isBlessedAudioType("audio");

        // then
        assertTrue(result);
    }

}