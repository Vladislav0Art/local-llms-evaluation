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
public class GeneratedGetPreferredMediaType_ScenarioInvalid {

    @Mock
    private ValidationContext context;

    @Test
    public void getPreferredMediaType_ScenarioInvalid() {
        String type = "invalidMedia";
        String path = "/path/to/invalid.mediapath";
        String result = OPFChecker30.getPreferredMediaType(type, path);
        assertTrue(result == null || result.isEmpty());
    }

}