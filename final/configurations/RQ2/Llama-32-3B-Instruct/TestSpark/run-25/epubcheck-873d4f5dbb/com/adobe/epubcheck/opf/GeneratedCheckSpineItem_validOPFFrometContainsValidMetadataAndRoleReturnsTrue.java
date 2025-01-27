package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;

public class GeneratedCheckSpineItem_validOPFFrometContainsValidMetadataAndRoleReturnsTrue {

    @Test
    public void checkSpineItem_validOPFFrometContainsValidMetadataAndRoleReturnsTrue() {
        OPFChecker30 opfChecker30 = new OPFChecker30(new ValidationContext());
        boolean result = opfChecker30.checkSpineItem(new OPFItem("valid Metadata"), new OPFHandler());
        assertTrue(result);
    }

}