package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetPreferredMediaType_ValidatesPreferredMediaType {

    @Mock
    private ValidationContext validationContext;

    @Mock
    private OPFHandler opfHandler;

    @Test
    public void getPreferredMediaType_ValidatesPreferredMediaType() {
        String type = "video/mp4";
        String path = "/path/to/video.mp4";
        String preferredMediaType = "video/mp4";
        assertEquals(preferredMediaType, OPFChecker30.getPreferredMediaType(type, path));
    }

}