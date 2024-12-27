package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem;
import org.mockito.Mockito;

public class GeneratedGetPreferredMediaTypeTest {

    @Test
    public void getPreferredMediaTypeTest() {
        assertEquals("audio/mp4", OPFChecker30.getPreferredMediaType("audio/mp4", "audio.mp4"));
        assertEquals("wrongType", OPFChecker30.getPreferredMediaType("wrongType", "audio.mp4"));
    }

}