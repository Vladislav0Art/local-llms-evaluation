package com.adobe.epubcheck.opf;

public class GeneratedCheckItemAfterResourceValidation {

    @Test
    public void checkItemAfterResourceValidation() {
        // Test case for checkItemAfterResourceValidation()
        MockEDictionary dictMock = new MockEDictionary();
        when(opfChecker30.checkItemAfterResourceValidation(OPFItem.class)).thenReturn(true);
        boolean result = opfChecker30.checkItemAfterResourceValidation(null, null);
        assertTrue(result);

        // Test case for checkItemAfterResourceValidation() without mocking
        dictionaryMock = new MockEDictionary();
        OPFItem itemMock = new MockOPFItem();
        when(opfChecker30.checkItemAfterResourceValidation(OPFItem.class, itemMock)).thenReturn(true);
        boolean result2 = opfChecker30.checkItemAfterResourceValidation(itemMock, null);
        assertTrue(result2);
    }

}