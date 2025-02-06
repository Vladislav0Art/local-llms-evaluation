package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class GeneratedRunWithNoArgsReturnsZero {

    @Test
    public void runWithNoArgsReturnsZero() {
        String[] args = {};
        int result = EpubChecker.class.getMethod("run", String[].class).invoke(null, (Object) args);
        assertEquals(0, result);
    }

}