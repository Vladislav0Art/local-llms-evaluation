package com.adobe.epubcheck.opf;

public class GeneratedTestOPFChecker30_isBlessedScriptType {

    @Test
    public void testOPFChecker30_isBlessedScriptType() {
        // Arrange
        String type = "script";
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);

        // Act
        boolean result = checker.isBlessedScriptType(type);

        // Assert
        assertTrue(result);
    }

}