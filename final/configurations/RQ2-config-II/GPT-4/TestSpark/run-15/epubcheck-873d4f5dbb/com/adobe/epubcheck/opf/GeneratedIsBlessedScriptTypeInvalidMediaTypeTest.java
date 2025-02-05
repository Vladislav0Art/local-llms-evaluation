package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIsBlessedScriptTypeInvalidMediaTypeTest {

    //isAudioType tests

    @Test
    public void isBlessedScriptTypeInvalidMediaTypeTest() {
        assertFalse(OPFChecker30.isBlessedScriptType("image/jpeg"));
    }

}