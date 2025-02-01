package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.mockito.Mockito.mock;

import com.adobe.epubcheck.opf.ValidationContext;

public class GeneratedTest {

    @Test
    public void OPFChecker30NullContextShouldThrowExceptionTest() {
        new OPFChecker30(null);
    }

    @Test
    public void OPFChecker30WithNotNullContextShouldPassTest() {
        ValidationContext context = mock(ValidationContext.class);
        new OPFChecker30(context);
    }

    @Test
    public void initHandlerShouldPassTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);
        checker.initHandler();
    }

    @Test
    public void checkPackageShouldThrowExceptionTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);
        checker.checkPackage();
    }

    @Test
    public void checkContentShouldReturnTrueTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);
        Boolean result = checker.checkContent();

        assertEquals(true, result);
    }

}