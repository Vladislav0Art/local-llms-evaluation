package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedIsBlessedScriptTypeValidScriptTypeTest {

    @Test
    public void isBlessedScriptTypeValidScriptTypeTest() {
        Assert.assertTrue(OPFChecker30.isBlessedScriptType("application/javascript"));
    }

}