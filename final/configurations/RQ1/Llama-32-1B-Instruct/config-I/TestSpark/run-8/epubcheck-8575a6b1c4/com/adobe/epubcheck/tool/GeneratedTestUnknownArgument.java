package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestUnknownArgument {

    @Test
    public void testUnknownArgument() {
        String[] args = {"-help"};
        boolean result = EpubCheck.main(args);
        assertTrue(result);
    }

}