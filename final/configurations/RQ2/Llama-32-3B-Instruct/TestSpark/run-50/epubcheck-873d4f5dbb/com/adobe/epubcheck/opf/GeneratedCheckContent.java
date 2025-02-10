package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedCheckContent {

    @Test
    public void checkContent() {
        boolean result = false;
        Mockito.when(OPFChecker30.checkContent(Mockito.any(ValidationContext.class))).thenReturn(result);
    }

}