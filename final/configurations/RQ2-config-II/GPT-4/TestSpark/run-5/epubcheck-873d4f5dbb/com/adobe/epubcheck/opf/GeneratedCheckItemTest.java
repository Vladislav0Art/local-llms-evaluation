package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCheckItemTest {

    @Test
    public void checkItemTest() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        OPFItem item = Mockito.mock(OPFItem.class);
        OPFHandler handler = Mockito.mock(OPFHandler.class);
        OPFChecker30 checker = new OPFChecker30(context);
        checker.checkItem(item, handler);
        Mockito.verify(handler).registerResource(item);
    }

}