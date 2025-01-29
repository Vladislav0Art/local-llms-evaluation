package com.adobe.epubcheck.tool;

public class GeneratedValidateFile_Props_ValuationContext_Broken {

    @Test
    public void validateFile_Props_ValuationContext_Broken() {
        String[] props = new String[]{"-p", "1"};
        EPUBVersion version = new EPUBVersion("3");
        Report report = new DefaultReportImpl();
        ValidationContext validationContext = new ValidationContextBuilder().build();
        EpubCheck check = new EpubChecker();
        check.validate(props, null);
    }

}