package com.adobe.epubcheck.opf;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedInitHandlerTest {

    @Test
    public void initHandlerTest() {
        OPFChecker30 checker = Mockito.mock(OPFChecker30.class);
        when(checker.initHandler()).thenReturn(true);
        assertEquals(true, checker.initHandler());
    }

}