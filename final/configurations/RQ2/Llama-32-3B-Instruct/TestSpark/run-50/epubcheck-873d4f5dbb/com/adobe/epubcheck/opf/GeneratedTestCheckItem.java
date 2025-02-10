package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestCheckItem {

    @Test
    public void testCheckItem() {
        OPFItem item = new OPFItem();
        OPFHandler opfHandler = new OPFHandler();
        boolean result = OPFChecker30.checkItem(item, opfHandler);
        Mockito.when(OPFChecker30.checkItem(Mockito.any(OPFItem.class), Mockito.any(OPFHandler.class))).thenReturn(true);
    }

}