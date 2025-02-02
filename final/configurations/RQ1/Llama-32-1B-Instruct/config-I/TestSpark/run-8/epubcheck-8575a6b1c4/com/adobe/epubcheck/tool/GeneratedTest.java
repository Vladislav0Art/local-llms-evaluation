package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void testNoFileSpecified() {
        boolean result = EpubCheck.main(new String[]{});
        assertTrue(result);
    }

    @Test
    public void testInvalidMode() {
        boolean result = EpubCheck.main(new String[]{"-invalid-mode"});
        assertTrue(result);
    }

    @Test
    public void testInvalidVersion() {
        boolean result = EpubCheck.main(new String[]{"-version=abc"});
        assertTrue(result);
    }

    @Test
    public void testCustomMessages() {
        String[] args = {"-customMessages", "path/to/file"};
        boolean result = EpubCheck.main(args);
        assertTrue(result);
    }

    @Test
    public void testListChecks() {
        String[] args = {"-listChecks"};
        boolean result = EpubCheck.main(args);
        assertTrue(result);
    }

    @Test
    public void testLocale() {
        String[] args = {"-locale", "en-US"};
        boolean result = EpubCheck.main(args);
        assertTrue(result);
    }

    @Test
    public void testUnknownArgument() {
        String[] args = {"-help"};
        boolean result = EpubCheck.main(args);
        assertTrue(result);
    }

    @Test
    public void testVersion() {
        String[] args = {"-version"};
        boolean result = EpubCheck.main(args);
        assertTrue(result);
    }

}