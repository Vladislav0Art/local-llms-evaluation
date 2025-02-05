package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.mockito.Mockito;
import org.junit.Assert;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;

public class GeneratedCheckItemValidItemTest {

    @Test
    public void checkItemValidItemTest() {
        OPFItem item = Mockito.mock(OPFItem.class);
        OPFHandler handler = Mockito.mock(OPFHandler.class);
        OPFChecker30 checker = new OPFChecker30();
        checker.checkItem(item, handler);
        Mockito.verify(handler).getItemById(Mockito.anyString());
    }

}