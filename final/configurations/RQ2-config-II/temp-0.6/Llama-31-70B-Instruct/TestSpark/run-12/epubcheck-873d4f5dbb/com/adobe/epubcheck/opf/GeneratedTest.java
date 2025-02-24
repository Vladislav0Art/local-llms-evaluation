package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void testInitHandler() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        OPFChecker30 opfChecker30 = new OPFChecker30(context);
        opfChecker30.initHandler();
        assertNotNull(opfChecker30.getPackage());
    }

    @Test
    public void testCheckPackage() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        OPFChecker30 opfChecker30 = new OPFChecker30(context);
        assertTrue(opfChecker30.checkPackage());
    }

    @Test
    public void testCheckContent() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        OPFChecker30 opfChecker30 = new OPFChecker30(context);
        assertTrue(opfChecker30.checkContent());
    }

    @Test
    public void testCheckItem() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        OPFChecker30 opfChecker30 = new OPFChecker30(context);
        OPFHandler opfHandler = Mockito.mock(OPFHandler.class);
        OPFItem item = Mockito.mock(OPFItem.class);
        opfChecker30.checkItem(item, opfHandler);
    }

    @Test
    public void testCheckItemAfterResourceValidation() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        OPFChecker30 opfChecker30 = new OPFChecker30(context);
        OPFItem item = Mockito.mock(OPFItem.class);
        opfChecker30.checkItemAfterResourceValidation(item);
    }

}