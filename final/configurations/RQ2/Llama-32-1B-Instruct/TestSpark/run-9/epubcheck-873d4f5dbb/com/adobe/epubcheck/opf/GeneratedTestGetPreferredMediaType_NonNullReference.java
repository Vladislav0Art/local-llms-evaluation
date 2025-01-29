package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestGetPreferredMediaType_NonNullReference {

    @Test
    public void testGetPreferredMediaType_NonNullReference() {
        MockReference reference = new MockReference();
        ValidationContext context = new ValidationContext(reference);
        assertEquals(ValidationContext.NON_NULL, context.getValidationContext());
    }
}

class MockReference {
}

class ValidationContext {
    private Object value;

    public ValidationContext(Object value) {
        this.value = value;
    }

    public static class Checker {
        public static ValidationContext getValidationContext() {
            return new ValidationContext(value);
        }
    }

}