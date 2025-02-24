package com.adobe.epubcheck.opf;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedCheckItemAfterResourceValidationTest {

    @Test
    public void checkItemAfterResourceValidationTest() {
        ValidationContext validationContext = mock(ValidationContext.class);
        OPFItem item = mock(OPFItem.class);
        OPFChecker30 opfChecker30 = new OPFChecker30(validationContext);
        opfChecker30.checkItemAfterResourceValidation(item);
    }

}