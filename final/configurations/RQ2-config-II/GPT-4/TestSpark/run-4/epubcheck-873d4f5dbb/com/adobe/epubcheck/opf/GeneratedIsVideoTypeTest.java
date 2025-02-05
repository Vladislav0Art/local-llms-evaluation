package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsVideoTypeTest {


    @Mock
    private ValidationContext mockValidationContext;

    @Mock
    private OPFItem mockOPFItem;

    @Mock
    private OPFHandler mockOPFHandler;

    @Test
    public void isVideoTypeTest() {
        assertTrue(OPFChecker30.isVideoType("video/mp4"));
    }

}