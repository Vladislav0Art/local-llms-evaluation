package com.adobe.epubcheck.opf;

public class GeneratedTestGetValidationContext {

    private ValidationContext validationContext;

    public OPFChecker30(ValidationContext validationContext) {
        this.validationContext = validationContext;
    }

    @Mock
    public ValidationContext getMockValidationContext() {
        return new ValidationContext();
    }

    @When("opfChecker30.getValidationContext()")
    public void setValidationContext(ValidationContext validationContext) {
        this.validationContext = validationContext;
    }

    @Test
    public void testGetValidationContext() {
        ValidationContext validationContext = getMockValidationContext();
        when(opfChecker30.getValidationContext()).thenReturn(validationContext);
        assertSame(validationContext, opfChecker30.getValidationContext());
    }

}