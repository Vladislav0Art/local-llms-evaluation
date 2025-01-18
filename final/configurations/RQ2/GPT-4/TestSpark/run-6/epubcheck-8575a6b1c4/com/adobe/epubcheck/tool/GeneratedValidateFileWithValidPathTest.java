package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.PrintStream;
import java.io.IOException;
import java.util.Locale;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.DefaultReportImpl;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.api.Report;

public class GeneratedValidateFileWithValidPathTest {

    @Test
    public void validateFileWithValidPathTest() {
        EpubChecker checker = new EpubChecker();
        Report report = new DefaultReportImpl("test");
        try {
            File file = new File("test.epub");
            if (!file.exists()) {
                file.createNewFile();
            }
            int result = checker.validateFile(file.getAbsolutePath(), EPUBVersion.VERSION_3, report, EPUBProfile.DEFAULT);
            assertEquals(0, result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}