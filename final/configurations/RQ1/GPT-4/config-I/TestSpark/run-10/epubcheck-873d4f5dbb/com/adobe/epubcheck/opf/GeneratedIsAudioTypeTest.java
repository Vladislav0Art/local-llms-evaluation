package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedIsAudioTypeTest {

    @Test
    public void isAudioTypeTest() {
        String audioType = "audio/mpeg";
        assert (OPFChecker30.isAudioType(audioType));
    }

}