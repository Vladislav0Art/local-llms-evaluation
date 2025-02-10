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
public class GeneratedGetPreferredMediaType_ScenarioValid {

    @Mock
    private ValidationContext context;

    @Test
    public void getPreferredMediaType_ScenarioValid() {
        String type = "image/jpeg";
        String path = "/path/to/image.jpg";
        String preferred = OPFChecker30.getPreferredMediaType(type, path);
        assertEquals("image/jpeg", preferred);
    }

}