package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;

public class GeneratedCheckContent_validOPFFrometContainsValidMetadata_ReturnsTrue {

    @Test
    public void checkContent_validOPFFrometContainsValidMetadata_ReturnsTrue() {
        OPFChecker30 opfChecker30 = new OPFChecker30(new ValidationContext());
        boolean result = opfChecker30.checkContent(new OPFItem("valid Metadata"));
        assertTrue(result);
    }

}