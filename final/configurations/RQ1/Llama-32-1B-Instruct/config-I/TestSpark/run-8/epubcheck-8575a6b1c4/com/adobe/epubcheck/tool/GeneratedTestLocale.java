package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestLocale {

    @Test
    public void testLocale() {
        String[] args = {"-locale", "en-US"};
        boolean result = EpubCheck.main(args);
        assertTrue(result);
    }

}