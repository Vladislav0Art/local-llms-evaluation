package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestVersion {

    @Test
    public void testVersion() {
        String[] args = {"-version"};
        boolean result = EpubCheck.main(args);
        assertTrue(result);
    }

}