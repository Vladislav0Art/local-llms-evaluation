package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCheckPackageReturnsFalse {

    @Mock
    private ValidationContext context;

    @InjectMocks
    private OPFChecker30 opfChecker30;

    @Test
    public void checkPackageReturnsFalse() {
        when(context.getOPFItem()).thenReturn(new OPFItem());
        assertTrue(opfChecker30.checkPackage());
    }

}