package com.adobe.epubcheck.opf;

import com.adobe.epubcheck.api.ValidationContext;
import com.adobe.epubcheck.opf.OPFItem;
import com.adobe.epubcheck.opf.OPFHandler;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedIsVideoTypeFalseTest {

    @Test
    public void isVideoTypeFalseTest() {
        String notVideoType = "text/html";
        assertFalse(OPFChecker30.isVideoType(notVideoType));
    }

}