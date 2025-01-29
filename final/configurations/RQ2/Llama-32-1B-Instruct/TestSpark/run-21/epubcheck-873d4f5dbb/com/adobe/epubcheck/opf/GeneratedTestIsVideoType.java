package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedTestIsVideoType {

    @Test
    public void testIsVideoType() {
        assertTrue(OPFChecker30.isVideoType("video"));
        assertFalse(OPFChecker30.isVideoType("audio"));
    }

}