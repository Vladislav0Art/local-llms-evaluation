package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.*;
import io.mola.galimatias.URL;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedIsCoreMediaTypeTest {

    @Test
    public void isCoreMediaTypeTest() {
        String type = "image/gif";
        Assert.assertTrue(OPFChecker30.isCoreMediaType(type));
    }

}