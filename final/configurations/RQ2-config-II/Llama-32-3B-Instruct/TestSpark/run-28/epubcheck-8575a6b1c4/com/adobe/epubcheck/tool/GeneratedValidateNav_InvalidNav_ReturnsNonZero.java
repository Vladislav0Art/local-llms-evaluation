package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;

public class GeneratedValidateNav_InvalidNav_ReturnsNonZero {

    @Test
    public void validateNav_InvalidNav_ReturnsNonZero() {
        NavChecker checker = new NavChecker();
        int result = checker.validate(new File("invalid.nav").getPath());
        assertNotEquals(0, result);
    }

}