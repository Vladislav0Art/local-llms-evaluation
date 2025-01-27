package com.adobe.epubcheck.tool;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class GeneratedRun_ValidReturnsZero {

    @BeforeClass
    public static void init() {
        // Initialize the class under test and any necessary resources.
    }

    @Test
    public void run_ValidReturnsZero() {
        String[] args = {"path", "profile"};
        EpubChecker checker = new EpubChecker();
        assertEquals(0, checker.run(args));
    }

}