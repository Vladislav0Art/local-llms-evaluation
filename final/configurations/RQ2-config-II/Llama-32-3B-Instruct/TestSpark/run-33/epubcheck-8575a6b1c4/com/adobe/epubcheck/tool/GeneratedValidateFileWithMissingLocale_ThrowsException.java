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

public class GeneratedValidateFileWithMissingLocale_ThrowsException {

    @Test
    public void validateFileWithMissingLocale_ThrowsException() {
        String path = "path/to/file.epub";
        EPUBVersion version = EPUBVersion.V1_0;
        Report report = new Report();
        try {
            int result = EpubChecker.class.getDeclaredMethod("validateFile", String.class, EPUBVersion.class, Report.class).invoke(null, (Object) path, (Object) version, (Object) report);
            fail("Expected exception was not thrown");
        } catch (Exception e) {
            // Expected
        }
    }

}