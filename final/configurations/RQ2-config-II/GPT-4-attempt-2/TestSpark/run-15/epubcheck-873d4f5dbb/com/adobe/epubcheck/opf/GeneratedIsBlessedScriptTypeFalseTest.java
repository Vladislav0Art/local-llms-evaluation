package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedIsBlessedScriptTypeFalseTest {

    @Test
    public void isBlessedScriptTypeFalseTest() {
        assertFalse(OPFChecker30.isBlessedScriptType("text/coffeescript"));
    }

}