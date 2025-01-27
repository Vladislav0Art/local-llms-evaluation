package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;

public class GeneratedIsCoreMediaType_validType_ReturnsTrue {

    @Test
    public void isCoreMediaType_validType_ReturnsTrue() {
        String type = "application/x-wcm-package-manifest";
        boolean result = OPFChecker30.isCoreMediaType(type);
        assertTrue(result);
    }

}