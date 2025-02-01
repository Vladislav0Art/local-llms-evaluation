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

public class GeneratedProcessFileExpandedTest {

    @Test
    public void processFileExpandedTest() {
        String path = new File("src/test/resources/test.epub").getAbsolutePath();
        EpubChecker checker = new EpubChecker();
        checker.expanded = true;
        LocalizableReport report = new LocalizableReport(path);
        int result = checker.processFile(report);
        Assert.assertEquals(1, result);
    }

}