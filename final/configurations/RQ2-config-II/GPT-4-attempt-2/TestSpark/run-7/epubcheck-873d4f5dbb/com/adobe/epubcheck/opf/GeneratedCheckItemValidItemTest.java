package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCheckItemValidItemTest {

    @Test
    public void checkItemValidItemTest() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        OPFHandler opfHandler = Mockito.mock(OPFHandler.class);
        OPFItem item = Mockito.mock(OPFItem.class);
        OPFChecker30 checker = new OPFChecker30(context);
        checker.checkItem(item, opfHandler);
        // Add relevant assertions
    }

}