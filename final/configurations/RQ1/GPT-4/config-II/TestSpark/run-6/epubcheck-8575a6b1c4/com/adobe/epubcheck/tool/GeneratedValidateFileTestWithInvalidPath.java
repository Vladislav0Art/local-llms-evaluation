package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EpubCheck;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class GeneratedValidateFileTestWithInvalidPath {

    @Test
    public void validateFileTestWithInvalidPath() {
        ByteArrayOutputStream errContent = new ByteArrayOutputStream();
        System.setErr(new PrintStream(errContent));

        EpubChecker checker = new EpubChecker();
        int result = checker.validateFile("invalid_path", EPUBVersion.VERSION_3, null, null);

        assertEquals(1, result);
        assertTrue(errContent.toString().contains("File 'invalid_path' not found"));

        System.setErr(System.err);
    }

}