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
public class GeneratedCheckContent_WhenIsEPUB3_ShouldReturnTrue {

    @Mock
    private ValidationContext context;

    @Mock
    private OPFHandler opfHandler;

    @Test
    public void checkContent_WhenIsEPUB3_ShouldReturnTrue() {
        Set<String> contentTypes = Set.of("application/x-dtd+xml", "text/xml");
        when(context.getContentType()).thenReturn(contentTypes);
        assertTrue(new OPFChecker30(context).checkContent());
    }

}