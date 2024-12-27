package com.adobe.epubcheck.opf;

import org.junit.Test;
import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.OPFHandler;
import com.adobe.epubcheck.opf.OPFItem;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedInitHandlerTest {

    @Test
    public void initHandlerTest() {
        ValidationContext context = new ValidationContext();
        OPFChecker30 checker = new OPFChecker30(context);
        checker.initHandler();
    }

}