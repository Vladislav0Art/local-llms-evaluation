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

public class GeneratedRun_AnyArgs_ReturnsCorrectResult {

    @Test
    public void run_AnyArgs_ReturnsCorrectResult() throws Exception {
        EpubChecker checker = new EpubChecker();
        File file = File.createTempFile("test", ".epub");
        FileWriter writer = new FileWriter(file);
        writer.write("<html><body>Hello World</body></html>");
        writer.close();

        int result = checker.run(new String[]{"--input", file.getAbsolutePath()});
        assertEquals(0, result);
    }

}