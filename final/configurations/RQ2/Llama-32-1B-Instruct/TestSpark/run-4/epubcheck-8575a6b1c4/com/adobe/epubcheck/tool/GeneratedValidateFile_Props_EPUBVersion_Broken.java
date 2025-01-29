package com.adobe.epubcheck.tool;

public class GeneratedValidateFile_Props_EPUBVersion_Broken {

    @Test
    public void validateFile_Props_EPUBVersion_Broken() {
        String[] props = new String[]{"-p", "1", "-v", "2"};
        Report report = new DefaultReportImpl();
        EpubCheck check = new EpubChecker();
        check.validate(props, null);
    }

}