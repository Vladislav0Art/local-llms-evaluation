package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.InjectMocks;

public class GeneratedTestIsVideoType {

    @Mock
    private ValidationContext context;

    @InjectMocks
    private OPFChecker30 opfChecker30UnderTest;

    @Test
    public void testIsVideoType() {
        assertFalse(opfChecker30UnderTest.isVideoType("other"));
        assertTrue(opfChecker30UnderTest.isVideoType("video"));
    }

}