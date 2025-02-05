package com.adobe.epubcheck.opf;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import com.adobe.epubcheck.opf.ValidationContext;
import com.adobe.epubcheck.api.EPUBProfile;

public class GeneratedIsBlessedScriptTypeTest {

    @Test
    public void isBlessedScriptTypeTest() {
        Assert.assertTrue(OPFChecker30.isBlessedScriptType("text/javascript"));
        Assert.assertFalse(OPFChecker30.isBlessedScriptType("application/pdf"));
    }

}