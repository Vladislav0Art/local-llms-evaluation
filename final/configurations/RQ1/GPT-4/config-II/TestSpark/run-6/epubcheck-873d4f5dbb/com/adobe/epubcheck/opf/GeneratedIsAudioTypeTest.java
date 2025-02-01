package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.*;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class GeneratedIsAudioTypeTest {

    @Test
    public void isAudioTypeTest() {
        String type = "audio/mp3";
        assert (OPFChecker30.isAudioType(type));
    }

}