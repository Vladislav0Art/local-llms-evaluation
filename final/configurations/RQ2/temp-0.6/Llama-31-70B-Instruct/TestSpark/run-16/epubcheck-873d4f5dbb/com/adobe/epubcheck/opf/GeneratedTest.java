package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void testInitHandler() {
        OPFChecker30 opfChecker30 = mock(OPFChecker30.class);
        when(opfChecker30.initHandler()).thenReturn(true);
        assertTrue(opfChecker30.initHandler());
    }

}