package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.mockito.Mockito;
import org.junit.Assert;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;

public class GeneratedIsAudioTypeValidTypeTest {

    @Test
    public void isAudioTypeValidTypeTest() {
        Assert.assertTrue(OPFChecker30.isAudioType("audio/mpeg"));
    }

}