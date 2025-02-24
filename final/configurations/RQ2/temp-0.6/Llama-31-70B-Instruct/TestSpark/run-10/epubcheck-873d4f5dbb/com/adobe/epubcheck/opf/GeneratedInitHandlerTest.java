package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedInitHandlerTest {

    @Test
    public void initHandlerTest() {
        OPFChecker30 opfChecker30 = new OPFChecker30(Mockito.mock(ValidationContext.class));
        opfChecker30.initHandler();

        assertTrue(opfChecker30.isValid());
    }

}