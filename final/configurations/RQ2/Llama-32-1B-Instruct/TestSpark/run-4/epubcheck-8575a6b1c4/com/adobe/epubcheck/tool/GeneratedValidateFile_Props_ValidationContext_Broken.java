package com.adobe.epubcheck.tool;

public class GeneratedValidateFile_Props_ValidationContext_Broken {

    @Test
    public void validateFile_Props_ValidationContext_Broken() {
        String[] props = new String[]{"-p", "1"};
        EPUBVersion version = new EPUBVersion("3");
        ValidationContext validationContext = new ValidationContextBuilder().build();
        EpubCheck check = new EpubChecker();
        check.validate(props, null);
    }

}