package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestValidationContext {

    @Test
    public void testValidationContext() {
        ValidationContext validationContext = create();

        boolean result = initHandler(validationContext);

        assertTrue(result);
    }

    public ValidationContext create() {
        // Your code here...
    }

    public boolean initHandler(ValidationContext validationContext) {
        // Your code here...
    }
}

}