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

public class GeneratedCreateReportTest {

    @Test
    public void createReportTest() throws IOException, InvalidVersionException {
        EpubChecker checker = new EpubChecker();
        Report report = checker.createReport();
        assertNotNull("Report should not be null", report);
    }

}