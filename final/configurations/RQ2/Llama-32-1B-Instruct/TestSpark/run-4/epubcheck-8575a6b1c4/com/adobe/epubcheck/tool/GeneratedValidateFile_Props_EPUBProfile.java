package com.adobe.epubcheck.tool;

public class GeneratedValidateFile_Props_EPUBProfile {

    @Test
    public void validateFile_Props_EPUBProfile() {
        String[] props = new String[]{"-p", "1"};
        EPUBVersion version = new EPUBVersion("3");
        EpubCheck check = new EpubChecker();
        check.validate(props, new EPUBProfile());
    }

}