package com.adobe.epubcheck.opf;

import org.junit.Test;
import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCheckItemTest {

    @Test
    public void checkItemTest() {
        ValidationContext context = new ValidationContext();
        OPFItem item = new OPFItem();
        OPFHandler handler = new OPFHandler();
        OPFChecker30 checker = new OPFChecker30(context);
        checker.checkItem(item, handler);
    }

}