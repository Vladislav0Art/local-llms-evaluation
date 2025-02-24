package com.adobe.epubcheck.opf;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedCheckItemTest {

    @Test
    public void checkItemTest() {
        OPFChecker30 checker = Mockito.mock(OPFChecker30.class);
        when(checker.checkItem()).thenReturn(true);
        assertEquals(true, checker.checkItem());
    }

}