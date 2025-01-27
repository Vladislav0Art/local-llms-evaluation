package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;

import org.w3c.epubcheck.core.Checker;
import org.w3c.epubcheck.util.url.URLUtils;
import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.EpubCheck;
import com.adobe.epubcheck.api.LocalizableReport;
import com.adobe.epubcheck.api.Report;

public class GeneratedProcessEpubFile_AnyArgs_ReturnsCorrectResult {

    @Test
    public void processEpubFile_AnyArgs_ReturnsCorrectResult() {
        EpubChecker checker = new EpubChecker();
        File file = File.createTempFile("test", ".epub");
        FileWriter writer = new FileWriter(file);
        writer.write("<html><body>Hello World</body></html>");
        writer.close();

        int result = checker.processEpubFile(new String[]{"--input", file.getAbsolutePath()});
        assertEquals(0, result);
    }

}