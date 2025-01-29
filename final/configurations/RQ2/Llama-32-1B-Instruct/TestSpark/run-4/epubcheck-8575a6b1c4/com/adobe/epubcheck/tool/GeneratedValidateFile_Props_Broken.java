package com.adobe.epubcheck.tool;

public class GeneratedValidateFile_Props_Broken {

    @Test
    public void validateFile_Props_Broken() {
        String[] props = new String[]{"-p", "1"};
        EPUBVersion version = new EPUBVersion("2");
        Report report = new DefaultReportImpl();
        EpubCheck check = new EpubCheck(report, version);
        check.validate(props, null);
    }

}