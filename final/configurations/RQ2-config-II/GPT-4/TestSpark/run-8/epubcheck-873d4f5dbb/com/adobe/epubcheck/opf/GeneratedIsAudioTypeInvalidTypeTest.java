package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.mockito.Mockito;
import org.junit.Assert;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;

public class GeneratedIsAudioTypeInvalidTypeTest {

    @Test
    public void isAudioTypeInvalidTypeTest() {
        Assert.assertFalse(OPFChecker30.isAudioType("invalid/type"));
    }

}