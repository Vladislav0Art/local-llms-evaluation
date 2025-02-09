package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem;

public class GeneratedIsBlessedAudioTypeValidTypeTest {

    @Test
    public void isBlessedAudioTypeValidTypeTest() {
        String type = "audio/mpeg";
        boolean result = OPFChecker30.isBlessedAudioType(type);
        assertTrue(result);
    }

}