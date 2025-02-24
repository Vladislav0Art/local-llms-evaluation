package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import static org.mockito.Mockito.*;

public class GeneratedTestCheckItemAfterResourceValidation {

    @Test
    public void testCheckItemAfterResourceValidation() {
        OPFChecker30 checker = new OPFChecker30(mock(ValidationContext.class));
        OPFItem item = mock(OPFItem.class);
        checker.checkItemAfterResourceValidation(item);
        assertTrue(checker.checked);
    }

}