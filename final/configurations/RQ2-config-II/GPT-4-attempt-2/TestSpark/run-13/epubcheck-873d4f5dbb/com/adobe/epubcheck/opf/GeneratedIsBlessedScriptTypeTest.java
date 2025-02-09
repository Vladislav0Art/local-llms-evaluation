package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.*;
import io.mola.galimatias.URL;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedIsBlessedScriptTypeTest {

    @Test
    public void isBlessedScriptTypeTest() {
        String type = "text/javascript";
        Assert.assertTrue(OPFChecker30.isBlessedScriptType(type));
    }

}