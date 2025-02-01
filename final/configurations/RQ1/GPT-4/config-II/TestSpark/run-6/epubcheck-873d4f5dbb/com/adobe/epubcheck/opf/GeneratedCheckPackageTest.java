package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.*;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class GeneratedCheckPackageTest {

    @Test
    public void checkPackageTest() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);

        checker.checkPackage();

        verify(context, times(2)).report();
    }

}