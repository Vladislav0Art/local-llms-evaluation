package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratedTestInitHandler {

    @Test
    public void testInitHandler() {
        // Arrange
        OPFChecker30 checker = new OPFChecker30();

        // Act
        assertTrue(checker.initHandler() != null);
    }

}