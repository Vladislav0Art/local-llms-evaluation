package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestInitHandler {

    @Test
    public void testInitHandler() {
        ValidationContext context = new ValidationContext();
        boolean isTrue = OPFChecker30.initHandler(context);
        Mockito.when(OPFChecker30.initHandler(Mockito.any(ValidationContext.class))).thenReturn(true);
    }

}