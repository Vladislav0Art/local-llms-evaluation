package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.Optional;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedIsAudioType_audio {

    @Mock
    private ValidationContext validationContext;

    @Mock
    private URLFragment urlFragment;

    @Test
    public void isAudioType_audio() {
        when(validationContext.getOPFVersion()).thenReturn("30");
        when(validationContext.isValidationDisabled()).thenReturn(false);

        String type = "audio";
        assertTrue(OPFChecker30.isAudioType(type));
    }

}