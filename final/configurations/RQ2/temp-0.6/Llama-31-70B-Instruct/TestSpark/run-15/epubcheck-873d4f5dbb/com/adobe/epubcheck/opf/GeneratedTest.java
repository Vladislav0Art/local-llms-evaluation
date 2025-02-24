package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void testInitHandler() {
        OPFChecker30 checker = new OPFChecker30(mock(ValidationContext.class));
        checker.initHandler();
        assertNotNull(checker.handler);
    }

    @Test
    public void testCheckPackage() {
        OPFChecker30 checker = new OPFChecker30(mock(ValidationContext.class));
        checker.checkPackage();
        assertTrue(checker.checked);
    }

    @Test
    public void testCheckContent() {
        OPFChecker30 checker = new OPFChecker30(mock(ValidationContext.class));
        checker.checkContent();
        assertTrue(checker.checked);
    }

    @Test
    public void testCheckItem() {
        OPFChecker30 checker = new OPFChecker30(mock(ValidationContext.class));
        OPFHandler handler = mock(OPFHandler.class);
        OPFItem item = mock(OPFItem.class);
        checker.checkItem(item, handler);
        assertTrue(checker.checked);
    }

    @Test
    public void testCheckItemAfterResourceValidation() {
        OPFChecker30 checker = new OPFChecker30(mock(ValidationContext.class));
        OPFItem item = mock(OPFItem.class);
        checker.checkItemAfterResourceValidation(item);
        assertTrue(checker.checked);
    }

}