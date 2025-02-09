package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.*;
import io.mola.galimatias.URL;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedIsVideoTypeTest {

    @Test
    public void isVideoTypeTest() {
        String type = "video/mp4";
        Assert.assertTrue(OPFChecker30.isVideoType(type));
    }

}