package com.adobe.epubcheck.opf;

public class GeneratedTestCheckSpineItem {

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
    public void testCheckSpineItem() {
        OPFItem item = new OPFItem("valid", "item");
        OPFSpineItem spineItem = new OPFSpineItem("valid", "spineItem");

        when(opfChecker30.checkSpineItem(item, spineItem)).thenReturn(true);
        assertTrue(opfChecker30.checkSpineItem(item, spineItem));
    }

}