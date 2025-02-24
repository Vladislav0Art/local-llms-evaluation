package com.adobe.epubcheck.opf;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedCheckItemAfterResourceValidationTest {

    @Test
    public void checkItemAfterResourceValidationTest() {
        OPFChecker30 opfChecker30 = new OPFChecker30(Mockito.mock(ValidationContext.class));
        opfChecker30.checkItemAfterResourceValidation(Mockito.mock(OPFItem.class));

        assertTrue(opfChecker30.isValid());
    }

}