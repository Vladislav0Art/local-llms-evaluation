package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.api.ValidationContext;

public class GeneratedCheckContentTest {

    @Test
    public void checkContentTest() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        OPFChecker30 checker = new OPFChecker30(context);

        assertTrue(checker.checkContent());
    }

}