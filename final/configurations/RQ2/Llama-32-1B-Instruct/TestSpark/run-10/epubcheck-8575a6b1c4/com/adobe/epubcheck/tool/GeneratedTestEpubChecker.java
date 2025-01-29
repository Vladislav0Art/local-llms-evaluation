package com.adobe.epubcheck.tool;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class GeneratedTestEpubChecker {

    @Test
    public void testEpubChecker() {
        Locale locale = new Locale("en", "US");
        EPUBVersion version = new EPUBVersion("1.2");
        Report report = new DefaultReportImpl();
        EPUBProfile profile = new EPUBProfile();

        assert StringUtils.hasText(report, "Validating files for the following paths:");
        String[] paths = {"path1.txt", "path2.pdf", "path3.zip"};
        for (String path : paths) {
            int result = EpubChecker.validateFile(path, version, report, profile);
            assertNotNull(result);
        }

        assert StringUtils.hasText(report, "Validating file 'path1.txt'...");
        report = new DefaultReportImpl();
        result = EpubChecker.validateFile("path1.txt", version, report, profile);
        assertNotNull(result);

        assert StringUtils.hasText(report, "Validating file 'path2.pdf'...");
        report = new DefaultReportImpl();
        result = EpubChecker.validateFile("path2.pdf", version, report, profile);
        assertNotNull(result);

        assert StringUtils.hasText(report, "Validating file 'path3.zip'...");
        report = new DefaultReportImpl();
        result = EpubChecker.validateFile("path3.zip", version, report, profile);
        assertNotNull(result);
    }

}