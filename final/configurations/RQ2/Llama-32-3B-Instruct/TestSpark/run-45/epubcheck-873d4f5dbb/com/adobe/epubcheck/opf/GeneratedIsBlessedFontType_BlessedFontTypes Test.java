package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedIsBlessedFontType_BlessedFontTypes Test {

    @Test
    public void isBlessedFontType_BlessedFontTypes

    Test() {
        assertTrue(OPFChecker30.isBlessedFontType("blessed font"));
        assertFalse(OPFChecker30.isBlessedFontType("font"));
    }

}