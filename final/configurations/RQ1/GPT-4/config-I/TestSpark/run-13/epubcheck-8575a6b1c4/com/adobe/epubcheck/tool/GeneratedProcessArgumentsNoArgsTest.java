package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.InvalidVersionException;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class GeneratedProcessArgumentsNoArgsTest {

    @Test
    public void processArgumentsNoArgsTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {};
        int result = epubChecker.run(args);
        assertEquals(1, result);
    }

}