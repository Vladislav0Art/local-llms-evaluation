package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedTestIsCoreMediaType {

    @Test
    public void testIsCoreMediaType() {
        assertTrue(OPFChecker30.isCoreMediaType("video", "path1"));
        assertFalse(OPFChecker30.isCoreMediaType("application/image", "path2"));
    }

}