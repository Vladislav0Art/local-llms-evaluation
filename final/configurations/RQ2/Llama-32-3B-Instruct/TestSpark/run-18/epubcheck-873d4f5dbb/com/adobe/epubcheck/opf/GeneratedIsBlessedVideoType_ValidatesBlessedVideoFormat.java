package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsBlessedVideoType_ValidatesBlessedVideoFormat {

    @Mock
    private ValidationContext validationContext;

    @Mock
    private OPFHandler opfHandler;

    @Test
    public void isBlessedVideoType_ValidatesBlessedVideoFormat() {
        String type = "video/blessed-mp4";
        assertTrue(OPFChecker30.isBlessedVideoType(type));
    }

}