package com.adobe.epubcheck.tool;

public class GeneratedTestValidateFileValidationContextNull {

    @Test
    public void testValidateFileValidationContextNull() throws Exception {
        EpubChecker checker = new EpubChecker();
        Map<String, Object> params = new HashMap<>();
        params.put("version", EPUBVersion.V2_0);
        int result = checker.validateFile(new File("/test.epub").getAbsolutePath(), null, null, params.get(EPUBProfile.EPUB2_0));
        assertNotEquals(0, result);
    }

}