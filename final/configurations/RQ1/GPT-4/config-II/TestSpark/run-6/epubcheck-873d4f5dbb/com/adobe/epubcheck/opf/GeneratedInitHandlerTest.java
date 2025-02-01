package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.*;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class GeneratedInitHandlerTest {

    @Test
    public void initHandlerTest() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);

        checker.initHandler();

        verify(context, times(1)).report();
    }

}