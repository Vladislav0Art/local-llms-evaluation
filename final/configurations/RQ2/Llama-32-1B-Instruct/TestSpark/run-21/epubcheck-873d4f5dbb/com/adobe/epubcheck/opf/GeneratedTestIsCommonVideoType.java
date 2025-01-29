package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedTestIsCommonVideoType {

    @Test
    public void testIsCommonVideoType() {
        assertTrue(OPFChecker30.isCommonVideoType("video"));
        assertTrue(OPFChecker30.isCommonVideoType("audio"));
    }

}