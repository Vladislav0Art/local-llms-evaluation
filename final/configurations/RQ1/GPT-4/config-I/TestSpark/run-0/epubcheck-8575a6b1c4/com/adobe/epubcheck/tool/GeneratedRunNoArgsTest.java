package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.*;
import com.adobe.epubcheck.util.*;
import com.adobe.epubcheck.tool.EpubChecker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.*;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRunNoArgsTest {

    @Test
    public void runNoArgsTest() {
        EpubChecker checker = new EpubChecker();
        String[] args = {};
        int result = checker.run(args);
        assertTrue("EpubChecker should return a non-zero value when no arguments are provided", result != 0);
    }

}