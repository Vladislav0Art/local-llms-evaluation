package com.adobe.epubcheck.opf;

public class GeneratedTestCheckItemThrows {

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
    public void testCheckItemThrows() {
        OPFItem item = new OPFItem("invalid", "item");
        OPFSpineItem spineItem = new OPFSpineItem("invalid", "spineItem");

        when(opfChecker30.checkItem(item, spineItem)).thenReturn(false);
        assertFalse(opfChecker30.checkItem(item, spineItem));
    }

}