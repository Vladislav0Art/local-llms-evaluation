package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsVideoType_ValidatesVideoFormat {

    @Mock
    private ValidationContext validationContext;

    @Mock
    private OPFHandler opfHandler;

    @Test
    public void isVideoType_ValidatesVideoFormat() {
        String type = "video/mp4";
        assertTrue(OPFChecker30.isVideoType(type));
    }

}