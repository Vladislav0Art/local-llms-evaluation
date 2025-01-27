package com.adobe.epubcheck.opf;

public class GeneratedTest {

    @Test
    public void testOPFHandler() {
        OPFHandler handler = mock(OPFHandler.class);
        create();
    }

    public ValidationContext create() {
        return new ValidationContext();
    }
}

public class OPFHandler {

    public ValidationContext validate(ValidationContext validationContext) {
        return null;
    }
}

class ValidationContext {
}

}