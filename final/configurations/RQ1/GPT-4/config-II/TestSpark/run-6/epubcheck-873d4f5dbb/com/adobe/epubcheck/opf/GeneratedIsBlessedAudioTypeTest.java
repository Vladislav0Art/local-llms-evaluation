package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.*;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class GeneratedIsBlessedAudioTypeTest {

    @Test
    public void isBlessedAudioTypeTest() {
        String type = "audio/mp4";
        assert (OPFChecker30.isBlessedAudioType(type));
    }

}