package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTestCheckItem {

    @Test
    public void testCheckItem() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        OPFChecker30 opfChecker30 = new OPFChecker30(context);
        OPFHandler opfHandler = Mockito.mock(OPFHandler.class);
        OPFItem item = Mockito.mock(OPFItem.class);
        opfChecker30.checkItem(item, opfHandler);
    }

}