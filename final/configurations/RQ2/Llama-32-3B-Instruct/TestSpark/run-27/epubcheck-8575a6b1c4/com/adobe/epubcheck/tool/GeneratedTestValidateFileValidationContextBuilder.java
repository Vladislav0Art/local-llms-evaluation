package com.adobe.epubcheck.tool;

public class GeneratedTestValidateFileValidationContextBuilder {

    @Test
    public void testValidateFileValidationContextBuilder() throws Exception {
        EpubChecker checker = new EpubChecker();
        ValidationContextBuilder builder = new ValidationContextBuilder(new File("/test.epub").getAbsolutePath());
        Map<String, Object> params = new HashMap<>();
        params.put("version", EPUBVersion.V2_0);
        int result = checker.validateFile(null, null, builder.build(), params.get(EPUBProfile.EPUB2_0));
        assertEquals(1, result);
    }

}