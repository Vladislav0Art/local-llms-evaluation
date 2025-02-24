package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestCheckContent {

    @Mock
    private ValidationContext mockValidationContext;

    @Mock
    private OPFHandler mockOPFHandler;

    @Test
    public void testCheckContent() {
        OPFChecker30 opfChecker30 = new OPFChecker30(mockValidationContext);
        boolean actual = opfChecker30.checkContent();
        assertEquals(actual, true);
    }

}