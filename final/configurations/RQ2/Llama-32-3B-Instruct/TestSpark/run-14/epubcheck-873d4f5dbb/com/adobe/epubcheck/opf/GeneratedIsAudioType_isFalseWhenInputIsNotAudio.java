package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.MalformedURLException;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsAudioType_isFalseWhenInputIsNotAudio {

    @Mock
    private ValidationContext context;

    @Mock
    private FeatureReport.Feature mockFeature;

    @Mock
    private MessageId mockMessageId;

    @Test
    public void isAudioType_isFalseWhenInputIsNotAudio() {
        // given:
        when(context.getValidationResult()).thenReturn(Optional.empty());

        // when and then
        OPFChecker30 checker = new OPFChecker30(context);
        assertFalse(checker.isAudioType("not_audio"));
    }

}