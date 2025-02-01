package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.mockito.Mockito.mock;

import com.adobe.epubcheck.opf.ValidationContext;

public class GeneratedCheckPackageShouldThrowExceptionTest {

    @Test
    public void checkPackageShouldThrowExceptionTest() {
        ValidationContext context = mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);
        checker.checkPackage();
    }

}