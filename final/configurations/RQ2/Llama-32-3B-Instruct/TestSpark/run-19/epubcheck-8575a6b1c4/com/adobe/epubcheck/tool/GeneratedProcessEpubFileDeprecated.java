package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedProcessEpubFileDeprecated {

    @Test
    public void processEpubFileDeprecated() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"--locale", "en"};
        int result = checker.processEpubFile(args);
        assertTrue(result < 0);
    }

}