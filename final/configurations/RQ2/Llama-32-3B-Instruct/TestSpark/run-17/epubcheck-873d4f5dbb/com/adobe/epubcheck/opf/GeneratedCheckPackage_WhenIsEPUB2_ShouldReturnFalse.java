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
public class GeneratedCheckPackage_WhenIsEPUB2_ShouldReturnFalse {

    @Mock
    private ValidationContext context;

    @Mock
    private OPFHandler opfHandler;

    @Test
    public void checkPackage_WhenIsEPUB2_ShouldReturnFalse() {
        Set<String> packageNames = Set.of("application/oebps-package", "package");
        when(context.getOPFName()).thenReturn(packageNames);
        assertFalse(new OPFChecker30(context).checkPackage());
    }

}