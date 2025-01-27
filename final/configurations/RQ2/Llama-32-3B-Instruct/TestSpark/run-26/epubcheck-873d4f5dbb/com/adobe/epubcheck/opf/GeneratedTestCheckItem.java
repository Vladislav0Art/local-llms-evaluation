package com.adobe.epubcheck.opf;

public class GeneratedTestCheckItem {

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
    public void testCheckItem() {
        OPFItem item = new OPFItem("valid", "item");
        OPFSpineItem spineItem = new OPFSpineItem("valid", "spineItem");

        when(opfChecker30.checkItem(item, spineItem)).thenReturn(true);
        assertTrue(opfChecker30.checkItem(item, spineItem));
    }

}