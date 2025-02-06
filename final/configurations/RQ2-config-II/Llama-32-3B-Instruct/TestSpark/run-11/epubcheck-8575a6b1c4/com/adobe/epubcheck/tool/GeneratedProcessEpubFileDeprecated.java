package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class GeneratedProcessEpubFileDeprecated {

    @Test
    public void processEpubFileDeprecated() {
        // Test deprecated method with mock EpubCheckFactory and report
        EpubCheck check = MockEpubCheck.create();
        Report report = new DefaultReportImpl();
        EpubChecker instance = new EpubChecker();
        int result = instance.processEpubFile(new String[]{"file1.epub"}, report, check);
        assertEquals(0, result);
    }

}