package com.adobe.epubcheck.opf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestOPFChecker30Constructor {

    @Test
    public void testOPFChecker30Constructor() {
        MockReference reference = new MockReference();
        OPFChecker30Checker opfChecker30 = new OPFChecker30(reference);
        assertEquals(reference, opfChecker30.getRef());
    }

}