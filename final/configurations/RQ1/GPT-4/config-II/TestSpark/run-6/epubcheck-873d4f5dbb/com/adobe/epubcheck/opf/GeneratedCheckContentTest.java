package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.*;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class GeneratedCheckContentTest {

    @Test
    public void checkContentTest() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);

        checker.checkContent();

        verify(context, times(2)).report();
    }

}