package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;

public class GeneratedCheckItem_validOPFFrometContainsValidMetadataAndRoleReturnsTrue {

    @Test
    public void checkItem_validOPFFrometContainsValidMetadataAndRoleReturnsTrue() {
        OPFChecker30 opfChecker30 = new OPFChecker30(new ValidationContext());
        boolean result = opfChecker30.checkItem(new OPFItem("valid Metadata"), new OPFHandler());
        assertTrue(result);
    }

}