package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTestInitHandler {

    @Test
    public void testInitHandler() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        OPFChecker30 opfChecker30 = new OPFChecker30(context);
        opfChecker30.initHandler();
        assertNotNull(opfChecker30.getPackage());
    }

}