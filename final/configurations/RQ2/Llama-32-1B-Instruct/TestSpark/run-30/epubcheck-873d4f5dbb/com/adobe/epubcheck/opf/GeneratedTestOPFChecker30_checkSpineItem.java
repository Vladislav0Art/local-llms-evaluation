package com.adobe.epubcheck.opf;

public class GeneratedTestOPFChecker30_checkSpineItem {

    @Test
    public void testOPFChecker30_checkSpineItem() {
        // Given
        String type = "audio/mpeg";
        // When
        OPSSpinner20Test.checkSpineItem = OPFChecker30::checkSpineItem;
        checker.initHandler();
        checker.checkSpineItem(createItem(type), validationContext);
    }

}