package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.*;
import io.mola.galimatias.URL;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedIsBlessedFontTypeTest {

    @Test
    public void isBlessedFontTypeTest() {
        String type = "application/font-woff";
        Assert.assertTrue(OPFChecker30.isBlessedFontType(type));
    }

}