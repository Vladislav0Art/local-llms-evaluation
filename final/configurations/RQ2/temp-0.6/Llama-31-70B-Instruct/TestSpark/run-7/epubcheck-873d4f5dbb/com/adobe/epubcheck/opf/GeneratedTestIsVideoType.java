package com.adobe.epubcheck.opf;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class GeneratedTestIsVideoType {

    private OPFChecker30 opfChecker30;

    @Before
    public void setUp() {
        opfChecker30 = new OPFChecker30(Mockito.mock(ValidationContext.class));
    }

    @Test
    public void testIsVideoType() {
        assertEquals(false, opfChecker30.isVideoType(null));
        assertEquals(false, opfChecker30.isVideoType(""));
        assertEquals(false, opfChecker30.isVideoType("video/"));
        assertEquals(true, opfChecker30.isVideoType("video/mp4"));
    }

}