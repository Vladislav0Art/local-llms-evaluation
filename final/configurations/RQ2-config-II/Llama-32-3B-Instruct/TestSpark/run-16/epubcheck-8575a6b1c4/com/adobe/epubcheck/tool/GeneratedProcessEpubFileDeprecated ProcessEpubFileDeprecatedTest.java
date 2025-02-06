package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedProcessEpubFileDeprecated ProcessEpubFileDeprecatedTest {

    @Test
    public void processEpubFileDeprecated

    ProcessEpubFileDeprecatedTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"input.ebook", "output.pdf"};
        // Check if processEpubFile is deprecated and calls run with same arguments
        assertEquals(0, (int) epubChecker.processEpubFile(args));
    }

}