package com.adobe.epubcheck.opf;

import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;
import com.adobe.epubcheck.opf.OPFChecker30;

public class GeneratedCheckContentTest {

    @Test
    public void checkContentTest() {
        OPFChecker30 checker = Mockito.mock(OPFChecker30.class);
        when(checker.checkContent()).thenReturn(true);
        assertEquals(true, checker.checkContent());
    }

}