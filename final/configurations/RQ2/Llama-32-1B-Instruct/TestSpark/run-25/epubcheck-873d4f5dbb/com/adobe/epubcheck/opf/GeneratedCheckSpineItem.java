package com.adobe.epubcheck.opf;

public class GeneratedCheckSpineItem {

    @Test
    public void checkSpineItem() {
        // Test case for checkSpineItem()
        MockOPFItem spineItemMock = new MockOPFItem();
        when(opfChecker30.checkSpineItem(OPFItem.class, spineItemMock)).thenReturn(true);
        boolean result = opfChecker30.checkSpineItem(null, spineItemMock);
        assertTrue(result);

        // Test case for checkSpineItem() without mocking
        dictionaryMock = new MockEDictionary();
        OPFItem itemMock = new MockOPFItem();
        when(opfChecker30.checkSpineItem(OPFItem.class, itemMock)).thenReturn(true);
        boolean result2 = opfChecker30.checkSpineItem(itemMock, null);
        assertTrue(result2);
    }

}