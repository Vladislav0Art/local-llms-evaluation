package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestCreateChecker {

    @Test
    public void testCreateChecker() throws Exception {
        EpubCheck checker = EpubChecker.createChecker();

        // Verify checker is not null
        assertNotNull(checker);

        // Verify checker.getLocale() returns locale
        assertEquals(Locale.ENGLISH, checker.getLocale());
    }
}

}