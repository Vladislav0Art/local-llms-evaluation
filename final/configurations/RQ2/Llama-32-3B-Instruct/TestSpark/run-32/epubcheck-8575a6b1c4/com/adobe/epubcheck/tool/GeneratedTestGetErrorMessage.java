package com.adobe.epubcheck.tool;

public class GeneratedTestGetErrorMessage {

    private EpubChecker epubChecker = new EpubChecker();

    @Test
    public void testGetErrorMessage() {
        DefaultReportImpl report = new DefaultReportImpl();
        assertEquals("", report.getErrorMessage());
    }

}