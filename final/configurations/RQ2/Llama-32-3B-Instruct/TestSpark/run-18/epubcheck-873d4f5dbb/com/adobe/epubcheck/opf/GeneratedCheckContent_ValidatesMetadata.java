package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckContent_ValidatesMetadata {

    @Mock
    private ValidationContext validationContext;

    @Mock
    private OPFHandler opfHandler;

    @Test
    public void checkContent_ValidatesMetadata() {
        when(validationContext.getOPF()).thenReturn(new OPF());
        OPFChecker30 instance = new OPFChecker30(validationContext);
        instance.checkContent();
    }

}