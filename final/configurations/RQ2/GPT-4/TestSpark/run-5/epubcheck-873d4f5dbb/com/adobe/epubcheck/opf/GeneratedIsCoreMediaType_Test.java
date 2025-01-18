package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.opf.*;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedIsCoreMediaType_Test {

    @Test
    public void isCoreMediaType_Test() {
        assertTrue(OPFChecker30.isCoreMediaType("text/css"));
        assertFalse(OPFChecker30.isCoreMediaType("text/javascript"));
    }

}