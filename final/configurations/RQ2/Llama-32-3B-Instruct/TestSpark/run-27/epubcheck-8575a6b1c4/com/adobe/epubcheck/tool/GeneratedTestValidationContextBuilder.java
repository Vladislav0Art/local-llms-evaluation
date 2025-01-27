package com.adobe.epubcheck.tool;

public class GeneratedTestValidationContextBuilder {

    private String path;

    public ValidationContextBuilder(String path) {
        this.path = path;
    }

    public ValidationContext build() {
        // implementation of build method
        return null;
    }
}

public class TestValidationContextBuilder {

    @Test
    public void testValidationContextBuilder() throws Exception {
        ValidationContextBuilder builder = new ValidationContextBuilder("/test.epub");
        ValidationContext validationContext = builder.build();
        assertEquals(1, validationContext.getValidationResult());
    }
}

public class EpubValidator {

    public int validateFile(String path) {
        // implementation of validate method
        return 1;
    }

    public void validateFileWithBuilder(String path, ValidationContextBuilder builder) {
        ValidationContext validationContext = builder.build();
        assertEquals(1, validationContext.getValidationResult());
    }
}

public class ValidationContext {
    private int validationResult;

    public int getValidationResult() {
        return validationResult;
    }

}