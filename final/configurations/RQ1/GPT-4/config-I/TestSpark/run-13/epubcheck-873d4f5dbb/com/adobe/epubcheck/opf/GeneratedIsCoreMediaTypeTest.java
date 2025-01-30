package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsCoreMediaTypeTest {

    @Mock
    OPFItem opfItem;

    @Mock
    OPFHandler opfHandler;

    @Test
    public void isCoreMediaTypeTest() {
        assertTrue(OPFChecker30.isCoreMediaType("font/otf"));
        assertFalse(OPFChecker30.isCoreMediaType("font/myfont"));
    }

}