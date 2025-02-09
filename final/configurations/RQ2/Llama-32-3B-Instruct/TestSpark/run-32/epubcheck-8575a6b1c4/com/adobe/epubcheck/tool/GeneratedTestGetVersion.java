package com.adobe.epubcheck.tool;

public class GeneratedTestGetVersion {

    private EpubChecker epubChecker = new EpubChecker();

    @Test
    public void testGetVersion() {
        DefaultReportImpl report = new DefaultReportImpl();
        assertEquals(0, report.getVersion());
    }

}