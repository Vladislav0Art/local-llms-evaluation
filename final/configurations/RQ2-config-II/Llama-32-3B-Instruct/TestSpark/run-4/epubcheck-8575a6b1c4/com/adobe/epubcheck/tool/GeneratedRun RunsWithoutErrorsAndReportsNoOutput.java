package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.contrib.java.lang.system.SystemPropertyRule;
import com.adobe.epubcheck.tool.EpubChecker;

public class GeneratedRun RunsWithoutErrorsAndReportsNoOutput {

    @Rule
    public final SystemPropertyRule systemProperties = new SystemPropertyRule()
            .set("epub.checker.locale", "en_US");

    @Test
    public void run

    RunsWithoutErrorsAndReportsNoOutput() throws IOException {
        String[] args = {"path/to/file.epub"};
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        EpubChecker checker = new EpubChecker();
        FileResourceProvider fileProvider = new FileResourceProvider(args[0]);
        ReportingLevel reportingLevel = ReportingLevel.MINIMAL;
        int result = checker.run(args);
        assertEquals(0, result);
        assert outContent.toString().isEmpty();
    }

}