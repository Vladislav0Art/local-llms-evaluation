package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.*;
import io.mola.galimatias.URL;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedGetPreferredMediaTypeTest {

    @Test
    public void getPreferredMediaTypeTest() {
        String type = "audio/mpg";
        String path = "/path/to/file.mp3";
        Assert.assertEquals("audio/mpeg", OPFChecker30.getPreferredMediaType(type, path));
    }

}