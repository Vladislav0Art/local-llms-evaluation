package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlessedScriptTypeValidBlessedScriptMediaTypeTest {

    //isAudioType tests

    @Test
    public void isBlessedScriptTypeValidBlessedScriptMediaTypeTest() {
        assertTrue(OPFChecker30.isBlessedScriptType("application/ecmascript"));
    }

}