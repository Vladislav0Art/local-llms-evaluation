package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckPackage_ThrowsExceptionForInvalidPackage {

    @Mock
    private ValidationContext validationContext;

    @Mock
    private OPFHandler opfHandler;

    @Test
    public void checkPackage_ThrowsExceptionForInvalidPackage() {
        when(validationContext.getOPF()).thenReturn(new OPF("invalid xml"));
        try {
            OPFChecker30 instance = new OPFChecker30(validationContext);
            instance.checkPackage();
            assert false;
        } catch (Exception e) {
            // expected
        }
    }

}