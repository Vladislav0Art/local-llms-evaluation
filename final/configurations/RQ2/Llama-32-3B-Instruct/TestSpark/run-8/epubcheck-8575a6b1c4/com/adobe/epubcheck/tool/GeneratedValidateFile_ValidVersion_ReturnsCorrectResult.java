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

public class GeneratedValidateFile_ValidVersion_ReturnsCorrectResult {

    @Test
    public void validateFile_ValidVersion_ReturnsCorrectResult() throws Exception {
        EpubChecker checker = new EpubChecker();
        File file = File.createTempFile("test", ".epub");
        FileWriter writer = new FileWriter(file);
        writer.write("<html><body>Hello World</body></html>");
        writer.close();

        int result = checker.validateFile(file.getAbsolutePath(), EPUBVersion.V2, new Report(), new EPUBProfile());
        assertEquals(0, result);
    }

}