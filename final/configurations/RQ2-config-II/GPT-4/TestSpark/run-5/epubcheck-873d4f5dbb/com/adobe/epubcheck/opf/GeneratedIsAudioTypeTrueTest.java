package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedIsAudioTypeTrueTest {

    @Test
    public void isAudioTypeTrueTest() {
        String audioType = "audio/mp3";
        assertTrue(OPFChecker30.isAudioType(audioType));
    }

}