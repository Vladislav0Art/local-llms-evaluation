package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;

public class GeneratedIsBlessedFontType_validType_ReturnsTrue {

    @Test
    public void isBlessedFontType_validType_ReturnsTrue() {
        String type = "blessed font/otf";
        boolean result = OPFChecker30.isBlessedFontType(type);
        assertTrue(result);
    }

}