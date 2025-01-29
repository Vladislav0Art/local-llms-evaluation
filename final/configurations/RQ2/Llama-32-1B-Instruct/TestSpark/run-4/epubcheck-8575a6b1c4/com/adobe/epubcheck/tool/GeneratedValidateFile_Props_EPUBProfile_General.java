package com.adobe.epubcheck.tool;

public class GeneratedValidateFile_Props_EPUBProfile_General {

    @Test
    public void validateFile_Props_EPUBProfile_General() {
        String[] props = new String[]{"-p", "1"};
        EPUBVersion version = new EPUBVersion("3");
        EpubCheck check = new EpubChecker();
        check.validate(props, new EPUBProfile());
    }

}