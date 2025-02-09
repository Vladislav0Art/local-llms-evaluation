package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.*;
import io.mola.galimatias.URL;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedIsBlessedVideoTypeTest {

    @Test
    public void isBlessedVideoTypeTest() {
        String type = "video/webm";
        Assert.assertTrue(OPFChecker30.isBlessedVideoType(type));
    }

}