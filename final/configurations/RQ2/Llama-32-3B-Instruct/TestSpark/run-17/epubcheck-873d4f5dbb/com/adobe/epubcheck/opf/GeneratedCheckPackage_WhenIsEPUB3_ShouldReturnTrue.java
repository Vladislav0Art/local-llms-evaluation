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
public class GeneratedCheckPackage_WhenIsEPUB3_ShouldReturnTrue {

    @Mock
    private ValidationContext context;

    @Mock
    private OPFHandler opfHandler;

    @Test
    public void checkPackage_WhenIsEPUB3_ShouldReturnTrue() {
        Set<String> packageNames = Set.of("application/oebps-package", "application/vnd.oebps-package");
        when(context.getOPFName()).thenReturn(packageNames);
        assertTrue(new OPFChecker30(context).checkPackage());
    }

}