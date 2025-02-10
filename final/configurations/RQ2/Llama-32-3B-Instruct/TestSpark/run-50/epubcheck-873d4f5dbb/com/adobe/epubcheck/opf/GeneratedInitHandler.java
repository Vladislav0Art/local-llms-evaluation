package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedInitHandler {

    @Test
    public void initHandler() {
        boolean isTrue = true;
        Mockito.when(OPFChecker30.initHandler(Mockito.any(String.class))).thenReturn(isTrue);
    }

}