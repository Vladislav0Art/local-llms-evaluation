package com.adobe.epubcheck.opf;

public class GeneratedTestOPFChecker30_checkItemAfterResourceValidation {

    @Test
    public void testOPFChecker30_checkItemAfterResourceValidation() {
        // Given
        String type = "audio/mpeg";
        // When
        OPSSpinner20Test.checkItemAfterResourceValidation = OPFChecker30::checkItemAfterResourceValidation;
        checker.initHandler();
        checker.checkItem(createItem(type), validationContext);
    }

}