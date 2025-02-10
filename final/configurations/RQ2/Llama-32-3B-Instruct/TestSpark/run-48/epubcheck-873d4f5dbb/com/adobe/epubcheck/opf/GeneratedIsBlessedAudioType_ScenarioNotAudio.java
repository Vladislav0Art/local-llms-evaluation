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
public class GeneratedIsBlessedAudioType_ScenarioNotAudio {

    @Mock
    private ValidationContext context;

    @Test
    public void isBlessedAudioType_ScenarioNotAudio() {
        String type = "not audio";
        boolean result = OPFChecker30.isBlessedAudioType(type);
        assertFalse(result);
    }

}