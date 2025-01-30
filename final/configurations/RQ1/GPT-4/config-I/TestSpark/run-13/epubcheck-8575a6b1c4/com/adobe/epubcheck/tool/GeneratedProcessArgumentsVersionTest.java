package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.InvalidVersionException;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class GeneratedProcessArgumentsVersionTest {

    @Test
    public void processArgumentsVersionTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = {"-v", "2.0"};
        epubChecker.run(args);
    }

}