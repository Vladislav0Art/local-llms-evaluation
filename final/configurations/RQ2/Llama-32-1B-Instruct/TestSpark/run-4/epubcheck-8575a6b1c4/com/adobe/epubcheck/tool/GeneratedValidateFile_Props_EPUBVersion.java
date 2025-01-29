package com.adobe.epubcheck.tool;

public class GeneratedValidateFile_Props_EPUBVersion {

    @Test
    public void validateFile_Props_EPUBVersion() {
        String[] props = new String[]{"-p", "1", "-v", "2"};
        Report report = new DefaultReportImpl();
        EpubCheck check = new EpubChecker();
        check.validate(props, new EPUBVersion("3"));
    }

}