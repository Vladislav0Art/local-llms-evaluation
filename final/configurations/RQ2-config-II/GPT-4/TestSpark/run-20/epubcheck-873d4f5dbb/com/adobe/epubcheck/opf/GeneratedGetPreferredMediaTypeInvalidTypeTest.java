package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetPreferredMediaTypeInvalidTypeTest {

    @Test
    public void getPreferredMediaTypeInvalidTypeTest() {
        assertEquals("invalid/type", OPFChecker30.getPreferredMediaType("invalid/type", "/path/file.unknown"));
    }

}