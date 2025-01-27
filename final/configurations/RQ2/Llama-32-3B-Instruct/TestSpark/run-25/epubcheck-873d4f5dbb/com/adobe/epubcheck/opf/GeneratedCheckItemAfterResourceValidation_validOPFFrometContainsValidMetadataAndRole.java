package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;

public class GeneratedCheckItemAfterResourceValidation_validOPFFrometContainsValidMetadataAndRole {

    @Test
    public void checkItemAfterResourceValidation_validOPFFrometContainsValidMetadataAndRole() {
        OPFChecker30 opfChecker30 = new OPFChecker30(new ValidationContext());
        boolean result = opfChecker30.checkItemAfterResourceValidation(new OPFItem("valid Metadata"));
        assertTrue(result);
    }

}