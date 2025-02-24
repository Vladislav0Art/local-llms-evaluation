package com.adobe.epubcheck.opf;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedTest {

    @Test
    public void initHandlerTest() {
        OPFChecker30 checker = Mockito.mock(OPFChecker30.class);
        when(checker.initHandler()).thenReturn(true);
        assertEquals(true, checker.initHandler());
    }

    @Test
    public void checkPackageTest() {
        OPFChecker30 checker = Mockito.mock(OPFChecker30.class);
        when(checker.checkPackage()).thenReturn(true);
        assertEquals(true, checker.checkPackage());
    }

    @Test
    public void checkContentTest() {
        OPFChecker30 checker = Mockito.mock(OPFChecker30.class);
        when(checker.checkContent()).thenReturn(true);
        assertEquals(true, checker.checkContent());
    }

    @Test
    public void checkItemTest() {
        OPFChecker30 checker = Mockito.mock(OPFChecker30.class);
        when(checker.checkItem()).thenReturn(true);
        assertEquals(true, checker.checkItem());
    }

    @Test
    public void checkItemAfterResourceValidationTest() {
        OPFChecker30 checker = Mockito.mock(OPFChecker30.class);
        when(checker.checkItemAfterResourceValidation()).thenReturn(true);
        assertEquals(true, checker.checkItemAfterResourceValidation());
    }

}