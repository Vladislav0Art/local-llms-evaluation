package com.adobe.epubcheck.tool;

public class GeneratedValidateFile_Props_ValidationContext {

    @Test
    public void validateFile_Props_ValidationContext() {
        String[] props = new String[]{"-p", "1"};
        EPUBVersion version = new EPUBVersion("3");
        ValidationContext validationContext = new ValidationContextBuilder().build();
        EpubCheck check = new EpubChecker();
        check.validate(props, validationContext);
    }

}