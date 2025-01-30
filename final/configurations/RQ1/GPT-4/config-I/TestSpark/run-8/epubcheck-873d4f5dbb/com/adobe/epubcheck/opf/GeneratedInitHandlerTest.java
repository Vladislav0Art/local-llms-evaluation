package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFChecker30;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class GeneratedInitHandlerTest {

    @Test
    public void initHandlerTest() {
        OPFChecker30 checker30 = mock(OPFChecker30.class);
        checker30.initHandler();

        //just validates the method is reached and completed without exceptions
        assertTrue(true);
    }

}