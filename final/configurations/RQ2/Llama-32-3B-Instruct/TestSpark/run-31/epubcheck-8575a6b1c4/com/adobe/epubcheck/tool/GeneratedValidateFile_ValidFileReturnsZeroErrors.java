package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

public class GeneratedValidateFile_ValidFileReturnsZeroErrors {

    @Test
    public void validateFile_ValidFileReturnsZeroErrors() {
        Report report = mock(Report.class);
        EPUBProfile profile = mock(EPUBProfile.class);
        int errors = new EpubChecker().validateFile("valid.epub", EPUBVersion.V1_3, report, profile);
        assertEquals(0, errors);
    }

}