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

public class GeneratedRun_EpubFile_SimpleValidation {

    @Test
    public void run_EpubFile_SimpleValidation() {
        String[] args = {"path/to/epub_file.epub"};
        int result = EpubChecker.run(args);
        assertTrue(result == 0);
    }

}