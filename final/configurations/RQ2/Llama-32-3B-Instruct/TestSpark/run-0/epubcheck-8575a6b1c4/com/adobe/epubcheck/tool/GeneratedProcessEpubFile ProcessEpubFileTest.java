package com.adobe.epubcheck.tool;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class GeneratedProcessEpubFile ProcessEpubFileTest {

    @BeforeClass
    public static void init() {
        // setup
    }

    @Test
    public void processEpubFile

    ProcessEpubFileTest() {
        EpubChecker instance = new EpubChecker();
        // No Mocking here
        assertNotEquals(0, instance.processEpubFile(new String[]{"path"}));
    }

}