package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestCheckContent {

    @Test
    public void testCheckContent() {
        ValidationContext context = new ValidationContext();
        boolean result = OPFChecker30.checkContent(context);
        Mockito.when(OPFChecker30.checkContent(Mockito.any(ValidationContext.class))).thenReturn(false);
    }

}