package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.util.EPUBVersion;
import io.mola.galimatias.URL;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedIsBlessedAudioTypeTest {

    @Test
    public void isBlessedAudioTypeTest() {
        assertTrue(OPFChecker30.isBlessedAudioType("audio/mp3"));
        assertFalse(OPFChecker30.isBlessedAudioType("audio/wav"));
    }

}