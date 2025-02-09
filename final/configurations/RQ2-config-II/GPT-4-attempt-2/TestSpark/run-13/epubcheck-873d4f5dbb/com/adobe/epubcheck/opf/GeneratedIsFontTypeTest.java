package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.*;
import io.mola.galimatias.URL;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedIsFontTypeTest {

    @Test
    public void isFontTypeTest() {
        String type = "application/x-font-woff";
        Assert.assertTrue(OPFChecker30.isFontType(type));
    }

}