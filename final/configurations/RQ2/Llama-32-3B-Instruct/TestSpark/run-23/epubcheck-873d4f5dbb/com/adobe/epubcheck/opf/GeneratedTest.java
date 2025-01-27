package com.adobe.epubcheck.opf;

import org.junit.Test;

public class GeneratedTest {

    private Object validationContext;

    protected Validation(Object validationContext) {
        this.validationContext = validationContext;
    }

    public static void main(String[] args) {
        // Arrange
        Object validationContext = new Object();

        // Act
        Validation validation = new Validation(validationContext);

        // Assert
        System.out.println("validation should not be null");
    }

    protected String getValidationContext() {
        return (String) validationContext;
    }
}

import org.junit.Test;

public class GeneratedTest {

}