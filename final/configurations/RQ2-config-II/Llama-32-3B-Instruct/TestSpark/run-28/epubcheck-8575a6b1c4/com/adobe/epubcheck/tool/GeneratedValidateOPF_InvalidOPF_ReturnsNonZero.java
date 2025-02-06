package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;

public class GeneratedValidateOPF_InvalidOPF_ReturnsNonZero {

    @Test
    public void validateOPF_InvalidOPF_ReturnsNonZero() {
        OPFChecker checker = new OPFChecker();
        int result = checker.validate(new File("invalid.opf").getPath());
        assertNotEquals(0, result);
    }
}

}