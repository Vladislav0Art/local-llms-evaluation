package com.adobe.epubcheck.tool;

public class GeneratedTestIsFailure {

    private EpubChecker epubChecker = new EpubChecker();

    @Test
    public void testIsFailure() {
        DefaultReportImpl report = new DefaultReportImpl();
        assertFalse(report.isFailure());
    }

}