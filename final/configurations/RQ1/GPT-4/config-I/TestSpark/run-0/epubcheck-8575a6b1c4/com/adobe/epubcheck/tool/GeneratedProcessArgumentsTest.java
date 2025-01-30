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

public class GeneratedProcessArgumentsTest {

    @Test
    public void processArgumentsTest() {
        EpubChecker checker = new EpubChecker();
        String[] validArgs1 = {"-v", "3.0"};
        String[] validArgs2 = {"-m", "exp"};
        String[] validArgs3 = {"-s"};
        String[] validArgs4 = {"-o", "-"};
        String validFilePath = "test.epub";
        String[] validArgs5 = {validFilePath};
        assertTrue("Should process arguments", checker.processArguments(validArgs1));
        assertTrue("Should process arguments", checker.processArguments(validArgs2));
        assertTrue("Should process arguments", checker.processArguments(validArgs3));
        assertTrue("Should process arguments", checker.processArguments(validArgs4));
        assertTrue("Should process arguments", checker.processArguments(validArgs5));
    }

}