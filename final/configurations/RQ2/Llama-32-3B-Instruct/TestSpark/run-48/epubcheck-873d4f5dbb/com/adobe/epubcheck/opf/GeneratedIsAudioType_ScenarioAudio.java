package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsAudioType_ScenarioAudio {

    @Mock
    private ValidationContext context;

    @Test
    public void isAudioType_ScenarioAudio() {
        String type = "audio";
        boolean result = OPFChecker30.isAudioType(type);
        assertTrue(result);
    }

}