package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;

public class GeneratedRun ValidArguments_ReturnsZero {

    @Test
    public void run

    ValidArguments_ReturnsZero() {
        EpubChecker checker = new EpubChecker();
        int result = checker.run(new String[]{"-v", "1.2"});
        assertEquals(0, result);
    }

}