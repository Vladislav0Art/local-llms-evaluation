package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.mockito.Mockito.mock;

import com.adobe.epubcheck.opf.ValidationContext;

public class GeneratedOPFChecker30WithNotNullContextShouldPassTest {

    @Test
    public void OPFChecker30WithNotNullContextShouldPassTest() {
        ValidationContext context = mock(ValidationContext.class);
        new OPFChecker30(context);
    }

}