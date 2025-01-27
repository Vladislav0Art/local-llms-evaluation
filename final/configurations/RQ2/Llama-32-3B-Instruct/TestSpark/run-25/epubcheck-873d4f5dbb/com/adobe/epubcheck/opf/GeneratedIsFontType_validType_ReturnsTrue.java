package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;

public class GeneratedIsFontType_validType_ReturnsTrue {

    @Test
    public void isFontType_validType_ReturnsTrue() {
        String type = "text/font-otf";
        boolean result = OPFChecker30.isFontType(type);
        assertTrue(result);
    }

}