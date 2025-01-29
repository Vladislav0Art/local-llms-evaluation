package com.adobe.epubcheck.opf;

public class GeneratedCheckItem {

    @Test
    public void checkItem() {
        // Test case for checkItem() using mock
        MockEDictionary dictMock = new MockEDictionary();
        when(opfChecker30.checkItem(OPFItem.class, null)).thenReturn(true);
        boolean result = opfChecker30.checkItem(null, dictMock);
        assertTrue(result);

        // Test case for checkItem() without mocking
        dictionaryMock = new MockEDictionary();
        OPFItem itemMock = new MockOPFItem();
        when(opfChecker30.checkItem(OPFItem.class, itemMock)).thenReturn(true);
        boolean result2 = opfChecker30.checkItem(itemMock, null);
        assertTrue(result2);
    }

}