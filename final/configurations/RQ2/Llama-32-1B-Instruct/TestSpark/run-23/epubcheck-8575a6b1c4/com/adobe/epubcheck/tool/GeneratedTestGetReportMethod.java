package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestGetReportMethod {

    @Test
    public void testGetReportMethod() {
        EpubChecker checker = new EpubChecker();
        String[] args = {"-e", "ebcdraft/1.2"};
        StringBuilder report = new StringBuilder();
        int result = checker.processEpubFile(args, report);
        assertThat(report.toString(), is("Error: Invalid file metadata"));
    }

}