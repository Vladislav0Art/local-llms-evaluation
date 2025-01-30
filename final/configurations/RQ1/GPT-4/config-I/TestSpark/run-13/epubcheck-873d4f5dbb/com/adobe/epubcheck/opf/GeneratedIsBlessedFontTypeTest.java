package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsBlessedFontTypeTest {

    @Mock
    OPFItem opfItem;

    @Mock
    OPFHandler opfHandler;

    @Test
    public void isBlessedFontTypeTest() {
        assertTrue(OPFChecker30.isBlessedFontType("font/otf"));
        assertFalse(OPFChecker30.isBlessedFontType("font/myfont"));
    }

}