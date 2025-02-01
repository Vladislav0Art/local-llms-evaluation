package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.mockito.Mockito.mock;

import com.adobe.epubcheck.opf.ValidationContext;

public class GeneratedOPFChecker30NullContextShouldThrowExceptionTest {

    @Test
    public void OPFChecker30NullContextShouldThrowExceptionTest() {
        new OPFChecker30(null);
    }

}