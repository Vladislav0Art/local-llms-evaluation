package com.adobe.epubcheck.opf;

public class GeneratedTestOPFChecker30_checkContent {

    @Test
    public void testOPFChecker30_checkContent() {
        // Given
        String type = "audio/mpeg";
        // When
        OPSSpinner20Test.checkItem = OPFChecker30::checkContent;
        checker.initHandler();
        checker.checkItem(createItem(type), validationContext);
    }

}