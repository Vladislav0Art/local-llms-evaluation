package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.InvalidVersionException;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class GeneratedProcessArgumentsRunTest {

    @Test
    public void processArgumentsRunTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"./test.epub", "-v", "2.0"};
        int val = epubChecker.run(args);
        assertEquals(val, 1);
    }

}