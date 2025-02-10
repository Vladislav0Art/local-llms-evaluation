package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedCheckItem {

    @Test
    public void checkItem() {
        OPFItem item = new OPFItem();
        OPFHandler opfHandler = new OPFHandler();

        boolean result = true;
        Mockito.when(OPFChecker30.checkItem(item, opfHandler)).thenReturn(result);

        verify(item).setItem(Mockito.anyString());
    }

}