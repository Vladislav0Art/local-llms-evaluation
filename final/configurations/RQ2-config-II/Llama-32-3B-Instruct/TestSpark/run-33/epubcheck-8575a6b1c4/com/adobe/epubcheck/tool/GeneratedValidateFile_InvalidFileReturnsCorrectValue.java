package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedValidateFile_InvalidFileReturnsCorrectValue {

    @Test
    public void validateFile_InvalidFileReturnsCorrectValue() throws Exception {
        String path = "path/to/invalid/file.epub";
        EPUBVersion version = EPUBVersion.V1_0;
        Report report = new Report();
        int result = EpubChecker.class.getDeclaredMethod("validateFile", String.class, EPUBVersion.class, Report.class).invoke(null, (Object) path, (Object) version, (Object) report);
        assertEquals(1, result);
    }

}