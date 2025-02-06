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

public class GeneratedValidateFile_ValidEpubFile_NoErrors {

    @Test
    public void validateFile_ValidEpubFile_NoErrors() {
        File file = new File("path/to valid epub_file.epub");
        int result = EpubChecker.validateFile(file.getAbsolutePath(), EPUBVersion.V30, null, null);
        assertTrue(result == 0);
    }

}