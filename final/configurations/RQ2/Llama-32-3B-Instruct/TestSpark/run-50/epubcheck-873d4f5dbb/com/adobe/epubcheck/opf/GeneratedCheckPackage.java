package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedCheckPackage {

    @Test
    public void checkPackage() {
        boolean result = false;
        Mockito.when(OPFChecker30.checkPackage(Mockito.any(ValidationContext.class))).thenReturn(result);
    }

}