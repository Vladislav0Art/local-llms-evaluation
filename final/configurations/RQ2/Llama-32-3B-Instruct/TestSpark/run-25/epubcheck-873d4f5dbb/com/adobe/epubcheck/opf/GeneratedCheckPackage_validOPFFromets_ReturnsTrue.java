package com.adobe.epubcheck.opf;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Set;

public class GeneratedCheckPackage_validOPFFromets_ReturnsTrue {

    @Test
    public void checkPackage_validOPFFromets_ReturnsTrue() {
        OPFChecker30 opfChecker30 = new OPFChecker30(new ValidationContext());
        boolean result = opfChecker30.checkPackage();
        assertTrue(result);
    }

}