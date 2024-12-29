package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsAudioType_shouldReturn_true_for_audio_type {

    @Mock
    private ValidationContext validationContext;

    @InjectMocks
    private OPFChecker30 opfChecker30;

    @Test
    public void isAudioType_shouldReturn_true_for_audio_type() {
        when(validationContext.getMediaType()).thenReturn("audio");
        boolean result = OPFChecker30.isAudioType("audio");
        assertThat(result, is(true));
    }

}