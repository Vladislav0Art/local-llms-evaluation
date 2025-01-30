package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.*;
import com.adobe.epubcheck.report.*;
import com.adobe.epubcheck.util.*;
import com.adobe.epubcheck.tool.EpubChecker;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class GeneratedProcessArgumentsInvalidArgsTest {

    @Test
    public void processArgumentsInvalidArgsTest() {
        EpubChecker checker = new EpubChecker();
        String[] invalidArgs1 = {"-invalid"};
        String[] invalidArgs2 = {"-v"};
        String[] invalidArgs3 = {"-m"};
        String invalidFilePath = "invalid.jpg";
        String[] invalidArgs4 = {invalidFilePath};
        assertFalse("Should not process arguments", checker.processArguments(invalidArgs1));
        assertFalse("Should not process arguments", checker.processArguments(invalidArgs2));
        assertFalse("Should not process arguments", checker.processArguments(invalidArgs3));
        assertFalse("Should not process arguments", checker.processArguments(invalidArgs4));
    }

}