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
public class GeneratedIsFontType_ShouldReturnTrueForWoff2 {

    @Mock
    private ValidationContext context;

    @Mock
    private OPFHandler opfHandler;

    @Test
    public void isFontType_ShouldReturnTrueForWoff2() {
        String type = "application/woff2";
        assertTrue(OPFChecker30.isFontType(type));
    }

}