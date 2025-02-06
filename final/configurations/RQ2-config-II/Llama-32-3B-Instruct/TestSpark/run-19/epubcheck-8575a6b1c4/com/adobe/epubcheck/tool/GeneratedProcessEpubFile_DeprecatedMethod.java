package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verifyNoInteractions;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

public class GeneratedProcessEpubFile_DeprecatedMethod {

    @Test
    public void processEpubFile_DeprecatedMethod() {
        String[] args = {"path/to/epub_file.epub"};
        int result = EpubChecker.processEpubFile(args);
        assertTrue(result == 0); // deprecated method should be removed
    }

}