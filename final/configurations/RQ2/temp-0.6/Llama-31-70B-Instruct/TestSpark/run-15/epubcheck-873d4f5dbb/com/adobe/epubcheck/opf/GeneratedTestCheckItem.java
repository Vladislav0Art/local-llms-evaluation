package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import static org.mockito.Mockito.*;

public class GeneratedTestCheckItem {

    @Test
    public void testCheckItem() {
        OPFChecker30 checker = new OPFChecker30(mock(ValidationContext.class));
        OPFHandler handler = mock(OPFHandler.class);
        OPFItem item = mock(OPFItem.class);
        checker.checkItem(item, handler);
        assertTrue(checker.checked);
    }

}