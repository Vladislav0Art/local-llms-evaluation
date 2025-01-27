package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

import org.w3c.epubcheck.core.Checker;
import org.w3c.epubcheck.util.url.URLUtils;

public class GeneratedValidateFile testValidateWithInvalidArgs {

    @Test
    public void validateFile

    testValidateWithInvalidArgs() throws InvalidVersionException, IOException {
        File file = new File("test.epub");
        int result = EpubChecker(new File[]{file}, EPUBVersion.EPUB3 .1).validateFile(file.toURI(), EPUBVersion.EPUB3
        .1, null, null);
        assertTrue(result != 0);
    }

}