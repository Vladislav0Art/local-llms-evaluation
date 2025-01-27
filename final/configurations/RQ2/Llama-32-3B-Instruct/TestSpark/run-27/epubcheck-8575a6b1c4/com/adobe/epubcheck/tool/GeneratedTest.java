package com.adobe.epubcheck.tool;

public class GeneratedTest {

    private String path;

    public ValidationContextBuilder(String path) {
        this.path = path;
    }

    public ValidationContext buildValidationResult() {
        return new ValidationContext();
    }
}

public class ValidationContext {

    private int validationResult;

    public ValidationContext(int validationResult) {
        this.validationResult = validationResult;
    }

    public int getValidationResult() {
        return validationResult;
    }

    public void setValidationResult(int result) {
        this.validationResult = result;
    }
}

public class EpubValidator {

    public int validateFile(String path) {
        // implementation of validate method
        return 1;
    }

    public void validateFileWithBuilder(String path, ValidationContextBuilder builder) {
        ValidationContext validationContext = builder.buildValidationResult();
        validationContext.setValidationResult(1);
    }
}

public class TestValidationContextBuilder {

}