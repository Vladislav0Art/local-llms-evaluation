package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetPreferredMediaType_ShouldReturnHtml {

    @Mock
    private ValidationContext context;

    @Mock
    private OPFHandler opfHandler;

    @Test
    public void getPreferredMediaType_ShouldReturnHtml() {
        String type = "text/html";
        when(opfHandler.getPreferredContentFormat()).thenReturn("html");
        assertEquals("html", OPFChecker30.getPreferredMediaType(type, ""));
    }

}