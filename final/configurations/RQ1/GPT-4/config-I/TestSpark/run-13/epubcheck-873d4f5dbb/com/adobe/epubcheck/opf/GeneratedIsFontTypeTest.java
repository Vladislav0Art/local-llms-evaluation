package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsFontTypeTest {

    @Mock
    OPFItem opfItem;

    @Mock
    OPFHandler opfHandler;

    @Test
    public void isFontTypeTest() {
        assertTrue(OPFChecker30.isFontType("font/otf"));
        assertFalse(OPFChecker30.isFontType("image/jpeg"));
    }

}