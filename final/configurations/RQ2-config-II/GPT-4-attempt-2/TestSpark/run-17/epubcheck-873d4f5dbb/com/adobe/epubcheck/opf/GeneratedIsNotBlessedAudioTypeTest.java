package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;

public class GeneratedIsNotBlessedAudioTypeTest {

    @Test
    public void IsNotBlessedAudioTypeTest() {
        String type = "audio/random";
        assertFalse(OPFChecker30.isBlessedAudioType(type));
    }

}