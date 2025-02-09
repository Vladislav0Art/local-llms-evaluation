package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem;

public class GeneratedCheckItemTest {

    @Test
    public void checkItemTest() {
        OPFItem item = Mockito.mock(OPFItem.class);
        OPFHandler handler = Mockito.mock(OPFHandler.class);
        OPFChecker30 checker = new OPFChecker30(Mockito.mock(ValidationContext.class));
        checker.checkItem(item, handler);
        Mockito.verify(handler, Mockito.times(1)).registerUncheckedItem(item);
    }

}