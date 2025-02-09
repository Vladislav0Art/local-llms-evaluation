package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.*;
import io.mola.galimatias.URL;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedIsAudioTypeTest {

    @Test
    public void isAudioTypeTest() {
        String type = "audio/mpeg";
        Assert.assertTrue(OPFChecker30.isAudioType(type));
    }

}