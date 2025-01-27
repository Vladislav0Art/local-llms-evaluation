package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckSpineItem_ValidatesNAV {

    @Mock
    private ValidationContext validationContext;

    @Mock
    private OPFHandler opfHandler;

    @Test
    public void checkSpineItem_ValidatesNAV() {
        when(validationContext.getOPF()).thenReturn(new OPF());
        when(opfHandler.getNav()).thenReturn(new NAV());
        OPFChecker30 instance = new OPFChecker30(validationContext);
        instance.checkSpineItem(new OPFItem(), opfHandler);
    }

}