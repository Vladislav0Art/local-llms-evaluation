package com.adobe.epubcheck.opf;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTestCheckItemAfterResourceValidation {

    @Test
    public void testCheckItemAfterResourceValidation() {
        ValidationContext context = Mockito.mock(ValidationContext.class);
        OPFChecker30 opfChecker30 = new OPFChecker30(context);
        OPFItem item = Mockito.mock(OPFItem.class);
        opfChecker30.checkItemAfterResourceValidation(item);
    }

}