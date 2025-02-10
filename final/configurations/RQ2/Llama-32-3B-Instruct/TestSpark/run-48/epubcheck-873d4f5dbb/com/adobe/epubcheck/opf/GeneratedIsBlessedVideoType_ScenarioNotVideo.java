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
public class GeneratedIsBlessedVideoType_ScenarioNotVideo {

    @Mock
    private ValidationContext context;

    @Test
    public void isBlessedVideoType_ScenarioNotVideo() {
        String type = "not video";
        boolean result = OPFChecker30.isBlessedVideoType(type);
        assertFalse(result);
    }

}