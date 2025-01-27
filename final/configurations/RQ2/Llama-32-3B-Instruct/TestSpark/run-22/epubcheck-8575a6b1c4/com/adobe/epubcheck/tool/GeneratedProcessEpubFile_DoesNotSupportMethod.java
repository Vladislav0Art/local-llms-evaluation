package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;

public class GeneratedProcessEpubFile_DoesNotSupportMethod {

    @Test
    public void processEpubFile_DoesNotSupportMethod() {
        @SuppressWarnings("unused")
        EpubChecker checker = new EpubChecker();
        assertThrows(UnsupportedOperationException.class, () -> checker.processEpubFile(new String[]{"-v", "1.0"}));
    }

    private static class MockLocale extends Locale {
        public boolean getBestVariant() {
            return true;
        }
    }

}