package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetPreferredMediaTypeTest {

    @Mock
    OPFItem opfItem;

    @Mock
    OPFHandler opfHandler;

    @Test
    public void getPreferredMediaTypeTest() {
        assertNull(OPFChecker30.getPreferredMediaType("font/myfont", "/path/myfont.ttf"));
        assertEquals("font/(ttf|otf)", OPFChecker30.getPreferredMediaType("application/font-sfnt", "/path/myfont.xyz"));
        assertEquals("font/otf", OPFChecker30.getPreferredMediaType("application/font-sfnt", "/path/myfont.otf"));
    }

}