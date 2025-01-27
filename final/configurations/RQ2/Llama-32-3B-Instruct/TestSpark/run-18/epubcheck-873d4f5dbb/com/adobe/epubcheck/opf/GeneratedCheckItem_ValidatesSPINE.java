package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckItem_ValidatesSPINE {

    @Mock
    private ValidationContext validationContext;

    @Mock
    private OPFHandler opfHandler;

    @Test
    public void checkItem_ValidatesSPINE() {
        when(validationContext.getOPF()).thenReturn(new OPF());
        when(opfHandler.getSpine()).thenReturn(new SPINE());
        OPFChecker30 instance = new OPFChecker30(validationContext);
        instance.checkItem(new OPFItem(), opfHandler);
    }

}