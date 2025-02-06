package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.contrib.java.lang.system.SystemPropertyRule;
import com.adobe.epubcheck.tool.EpubChecker;

public class GeneratedRun_ReturnsCorrectResult {

    @Rule
    public final SystemPropertyRule systemProperties = new SystemPropertyRule()
            .set("epub.checker.locale", "en_US");

    @Test
    public void run_ReturnsCorrectResult() throws IOException {
        String[] args = {"path/to/file.epub", "path/to/valid.epub"};
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        EpubChecker checker = new EpubChecker();
        FileResourceProvider fileProvider = new FileResourceProvider(args[0]);
        ReportingLevel reportingLevel = ReportingLevel.MINIMAL;
        int result = checker.run(args);
        assertEquals(1, result);
        assert !outContent.toString().isEmpty();
    }

}