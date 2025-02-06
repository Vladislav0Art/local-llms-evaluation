package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;

public class GeneratedValidateNav_ValidNav_ReturnsZero {

    @Test
    public void validateNav_ValidNav_ReturnsZero() {
        NavChecker checker = new NavChecker();
        int result = checker.validate(new File("valid.nav").getPath());
        assertEquals(0, result);
    }

}