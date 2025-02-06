package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

public class GeneratedProcessEpubFile_DeprecatedTest {

    @Test
    public void processEpubFile_DeprecatedTest() {
        @SuppressWarnings("unchecked")
        EpubChecker instance = (EpubChecker) org.mockito.Mockito.mock(EpubChecker.class);
        instance.processEpubFile(new String[]{"arg1", "arg2"});
    }

}