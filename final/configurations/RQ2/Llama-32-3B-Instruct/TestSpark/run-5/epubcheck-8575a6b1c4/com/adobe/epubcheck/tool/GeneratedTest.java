package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void getLocale() {
        EpubChecker checker = new EpubChecker();
        Locale locale = checkergetLocale();
        assertEquals(Locale.getDefault(), locale);
    }

    @Test
    public void run() throws IOException {
        String[] argsArray = {"path", "version"};
        EpubChecker checker = new EpubChecker();
        int result = checker.run(argsArray);
        assertEquals(0, result);
    }

    @Test
    public void processEpubFile() {
        EpubChecker checker = new EpubChecker();
        String[] argsArray = {"path", "version"};
        int result = checker.processEpubFile(argsArray);
        assertEquals(0, result);
    }

}