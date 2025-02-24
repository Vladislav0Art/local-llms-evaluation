package com.adobe.epubcheck.opf;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import static org.mockito.Mockito.*;

public class GeneratedTestInitHandler {

    @Test
    public void testInitHandler() {
        OPFChecker30 checker = new OPFChecker30(mock(ValidationContext.class));
        checker.initHandler();
        assertNotNull(checker.handler);
    }

}