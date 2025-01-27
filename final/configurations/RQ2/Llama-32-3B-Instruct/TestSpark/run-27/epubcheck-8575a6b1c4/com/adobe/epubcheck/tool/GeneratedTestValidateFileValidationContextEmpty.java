package com.adobe.epubcheck.tool;

public class GeneratedTestValidateFileValidationContextEmpty {

    @Test
    public void testValidateFileValidationContextEmpty() throws Exception {
        EpubChecker checker = new EpubChecker();
        Map<String, Object> params = new HashMap<>();
        params.put("version", EPUBVersion.V2_0);
        int result = checker.validateFile(new File("/test.epub").getAbsolutePath(), null, null, params.get(EPUBProfile.EPUB2_0));
        assertEquals(1, result);
    }

}