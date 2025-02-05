package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedIsCoreMediaTypeFalseTest {

    @Test
    public void isCoreMediaTypeFalseTest() {
        String notCoreType = "text/html";
        assertFalse(OPFChecker30.isCoreMediaType(notCoreType));
    }

}