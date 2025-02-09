package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlessedScriptTypeInvalidScriptTypeTest {

    @Test
    public void isBlessedScriptTypeInvalidScriptTypeTest() {
        Assert.assertFalse(OPFChecker30.isBlessedScriptType("invalid/javascript"));
    }

}