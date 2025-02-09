package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsCoreMediaTypeValidTypeTest {

    @Test
    public void isCoreMediaTypeValidTypeTest() {
        assertTrue(OPFChecker30.isCoreMediaType("image/jpeg"));
    }

}