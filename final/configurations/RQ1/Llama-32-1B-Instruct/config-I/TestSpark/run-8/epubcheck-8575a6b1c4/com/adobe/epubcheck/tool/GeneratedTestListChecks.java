package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestListChecks {

    @Test
    public void testListChecks() {
        String[] args = {"-listChecks"};
        boolean result = EpubCheck.main(args);
        assertTrue(result);
    }

}