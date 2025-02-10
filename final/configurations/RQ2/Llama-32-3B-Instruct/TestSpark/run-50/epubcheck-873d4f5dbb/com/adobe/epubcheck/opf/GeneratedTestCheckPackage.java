package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestCheckPackage {

    @Test
    public void testCheckPackage() {
        ValidationContext context = new ValidationContext();
        boolean result = OPFChecker30.checkPackage(context);
        Mockito.when(OPFChecker30.checkPackage(Mockito.any(ValidationContext.class))).thenReturn(false);
    }

}