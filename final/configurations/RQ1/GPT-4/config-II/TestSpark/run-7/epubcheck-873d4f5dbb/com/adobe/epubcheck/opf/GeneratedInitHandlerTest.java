package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.OPFChecker30;
import com.adobe.epubcheck.util.*;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.doNothing;

public class GeneratedInitHandlerTest {

    @Test
    public void initHandlerTest() {
        ValidationContext context = new ValidationContext.Builder().build();
        OPFChecker30 checker = new OPFChecker30(context);

        checker.initHandler();
    }

}