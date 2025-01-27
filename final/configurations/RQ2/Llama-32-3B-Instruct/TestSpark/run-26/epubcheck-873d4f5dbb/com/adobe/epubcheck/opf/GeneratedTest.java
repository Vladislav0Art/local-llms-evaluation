package com.adobe.epubcheck.opf;

public class GeneratedTest {

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

    @Test
    public void testCheckItem() {
        OPFItem item = new OPFItem("valid", "item");
        OPFSpineItem spineItem = new OPFSpineItem("valid", "spineItem");

        when(opfChecker30.checkItem(item, spineItem)).thenReturn(true);
        assertTrue(opfChecker30.checkItem(item, spineItem));
    }

    @Test
    public void testCheckSpineItem() {
        OPFItem item = new OPFItem("valid", "item");
        OPFSpineItem spineItem = new OPFSpineItem("valid", "spineItem");

        when(opfChecker30.checkSpineItem(item, spineItem)).thenReturn(true);
        assertTrue(opfChecker30.checkSpineItem(item, spineItem));
    }

    @Test
    public void testCheckItemThrows() {
        OPFItem item = new OPFItem("invalid", "item");
        OPFSpineItem spineItem = new OPFSpineItem("invalid", "spineItem");

        when(opfChecker30.checkItem(item, spineItem)).thenReturn(false);
        assertFalse(opfChecker30.checkItem(item, spineItem));
    }

    @Test
    public void testCheckSpineItemThrows() {
        OPFItem item = new OPFItem("valid", "item");
        OPFSpineItem spineItem = new OPFSpineItem("invalid", "spineItem");

        when(opfChecker30.checkSpineItem(item, spineItem)).thenReturn(false);
        assertFalse(opfChecker30.checkSpineItem(item, spineItem));
    }
}

public class ValidationContext {
    public String getProperty() {
        return "value";
    }

}