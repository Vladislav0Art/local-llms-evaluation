package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.contrib.java.lang.system.SystemPropertyRule;
import com.adobe.epubcheck.tool.EpubChecker;

public class GeneratedValidateFile_ReturnsCorrectResultForValidFile {

    @Rule
    public final SystemPropertyRule systemProperties = new SystemPropertyRule()
            .set("epub.checker.locale", "en_US");

    @Test
    public void validateFile_ReturnsCorrectResultForValidFile() throws IOException {
        String path = "path/to/valid.epub";
        EPUBVersion version = EPUBVersion.V3;
        Report report = new DefaultReportImpl();
        EPUBProfile profile = new DefaultEPUBProfile();
        int result = new EpubChecker().validateFile(path, version, report, profile);
        assertEquals(0, result);
    }

}