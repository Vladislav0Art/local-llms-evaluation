package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;

public class GeneratedValidateOPF_ValidOPF_ReturnsZero {

    @Test
    public void validateOPF_ValidOPF_ReturnsZero() {
        OPFChecker checker = new OPFChecker();
        int result = checker.validate(new File("valid.opf").getPath());
        assertEquals(0, result);
    }

}