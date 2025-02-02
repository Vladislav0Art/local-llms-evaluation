package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestCustomMessages {

    @Test
    public void testCustomMessages() {
        String[] args = {"-customMessages", "path/to/file"};
        boolean result = EpubCheck.main(args);
        assertTrue(result);
    }

}