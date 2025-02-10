package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void testInitHandler() {
        ValidationContext context = new ValidationContext();
        boolean isTrue = OPFChecker30.initHandler(context);
        Mockito.when(OPFChecker30.initHandler(Mockito.any(ValidationContext.class))).thenReturn(true);
    }

    @Test
    public void testCheckPackage() {
        ValidationContext context = new ValidationContext();
        boolean result = OPFChecker30.checkPackage(context);
        Mockito.when(OPFChecker30.checkPackage(Mockito.any(ValidationContext.class))).thenReturn(false);
    }

    @Test
    public void testCheckContent() {
        ValidationContext context = new ValidationContext();
        boolean result = OPFChecker30.checkContent(context);
        Mockito.when(OPFChecker30.checkContent(Mockito.any(ValidationContext.class))).thenReturn(false);
    }

    @Test
    public void testCheckItem() {
        OPFItem item = new OPFItem();
        OPFHandler opfHandler = new OPFHandler();
        boolean result = OPFChecker30.checkItem(item, opfHandler);
        Mockito.when(OPFChecker30.checkItem(Mockito.any(OPFItem.class), Mockito.any(OPFHandler.class))).thenReturn(true);
    }

    @Test
    public void testCheckItemAfterResourceValidation() {
        OPFItem item = new OPFItem();
        boolean result = OPFChecker30.checkItemAfterResourceValidation(item);
        Mockito.when(OPFChecker30.checkItemAfterResourceValidation(Mockito.any(OPFItem.class))).thenReturn(true);
    }
}

class ValidationContext {
}

class OPFItem {
}

}