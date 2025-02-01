package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EPUBProfile;
import com.adobe.epubcheck.api.LocalizableReport;
import com.adobe.epubcheck.util.Archive;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.ReportingLevel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.File;

public class GeneratedValidateFileWithAbsolutePathTest {

    @Test
    public void validateFileWithAbsolutePathTest() {
        String path = new File("src/test/resources/test.epub").getAbsolutePath();
        EpubChecker checker = new EpubChecker();
        LocalizableReport report = new LocalizableReport("test");
        int result = checker.validateFile(path, EPUBVersion.VERSION_2, report, EPUBProfile.DEFAULT);
        Assert.assertEquals(0, result);
    }

}