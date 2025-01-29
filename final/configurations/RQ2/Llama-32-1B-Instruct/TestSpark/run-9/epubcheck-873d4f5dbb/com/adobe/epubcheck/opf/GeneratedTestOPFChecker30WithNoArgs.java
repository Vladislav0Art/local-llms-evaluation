package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestOPFChecker30WithNoArgs {

    @Test
    public void testOPFChecker30WithNoArgs() {
        MockReference reference = new MockReference();
        OPFChecker30Checker opfChecker30 = new OPFChecker30(reference);
        assertEquals(ValidationContext.NON_NULL, opfChecker30.getValidationContext());
    }

}