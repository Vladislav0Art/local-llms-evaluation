package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.File;

public class GeneratedTest {

    @Test
    public void testEpubCheck() {
        Checker checker = new Checker();
        String expectedOutput = "The following files are not valid EPUBs:\n" +
                "- file1.epub\n" +
                "- file2.epub";
        assertEquals(expectedOutput, checker.checkFile("file1.epub"));
        assertEquals(expectedOutput, checker.checkFile("file2.epub"));
    }

    @Test
    public void testInvalidEpub() {
        Checker checker = new Checker();
        String expectedOutput = "The following files are not valid EPUBs:\n" +
                "- file1.epub\n" +
                "- file3.pdf";
        assertEquals(expectedOutput, checker.checkFile("file1.epub"));
        assertEquals(expectedOutput, checker.checkFile("file3.pdf"));
    }

    @Test
    public void testValidEpub() {
        Checker checker = new Checker();
        String expectedOutput = "The following files are valid EPUBs:\n" +
                "- file4.epub\n" +
                "- file5.epub";
        assertEquals(expectedOutput, checker.checkFile("file4.epub"));
        assertEquals(expectedOutput, checker.checkFile("file5.epub"));
    }

    @Test
    public void testNoFile() {
        Checker checker = new Checker();
        String expectedOutput = "The following files are not valid EPUBs:\n" +
                "- file1.epub\n" +
                "-";
        assertEquals(expectedOutput, checker.checkFile(""));
    }

    @Test
    public void testInvalidVersion() {
        Checker checker = new Checker();
        String expectedOutput = "Invalid version specified in the command line (expected 4 characters, got 10)";
        assertEquals(expectedOutput, checker.checkVersion("12.0"));
    }

    @Test
    public void testValidVersion() {
        Checker checker = new Checker();
        String expectedOutput = "The following files are valid EPUBs:\n" +
                "- file1.epub\n" +
                "- file2.epub";
        assertEquals(expectedOutput, checker.checkVersion("4.2"));
    }

    @Test
    public void testNoVersion() {
        Checker checker = new Checker();
        String expectedOutput = "Invalid version specified in the command line (expected 4 characters, got 10)";
        assertEquals(expectedOutput, checker.checkVersion(""));
    }

    @Test
    public void testFileWithSpaceInName() {
        Checker checker = new Checker();
        String expectedOutput = "The following files are not valid EPUBs:\n" +
                "- file with space in name.epub\n" +
                "- file2.epub";
        assertEquals(expectedOutput, checker.checkFile("file with space in name.epub"));
        assertEquals(expectedOutput, checker.checkFile("file2.epub"));
    }

    @Test
    public void testFileWithoutSpaceInName() {
        Checker checker = new Checker();
        String expectedOutput = "The following files are not valid EPUBs:\n" +
                "- file1.epub\n" +
                "- file2.pdf";
        assertEquals(expectedOutput, checker.checkFile("file1.epub"));
        assertEquals(expectedOutput, checker.checkFile("file2.pdf"));
    }

    @Test
    public void testFileWithExtension() {
        Checker checker = new Checker();
        String expectedOutput = "The following files are not valid EPUBs:\n" +
                "- file1.epub\n" +
                "- file2.txt";
        assertEquals(expectedOutput, checker.checkFile("file1.epub"));
        assertEquals(expectedOutput, checker.checkFile("file2.txt"));
    }

    @Test
    public void testFileWithoutExtension() {
        Checker checker = new Checker();
        String expectedOutput = "The following files are not valid EPUBs:\n" +
                "- file1\n" +
                "- file2";
        assertEquals(expectedOutput, checker.checkFile("file1"));
        assertEquals(expectedOutput, checker.checkFile("file2"));
    }

    @Test
    public void testFileWithInvalidExtension() {
        Checker checker = new Checker();
        String expectedOutput = "The following files are not valid EPUBs:\n" +
                "- file1.pdf\n" +
                "- file2.txt";
        assertEquals(expectedOutput, checker.checkFile("file1.pdf"));
        assertEquals(expectedOutput, checker.checkFile("file2.txt"));
    }

    @Test
    public void testNoExtension() {
        Checker checker = new Checker();
        String expectedOutput = "The following files are not valid EPUBs:\n" +
                "- file1\n" +
                "- file2";
        assertEquals(expectedOutput, checker.checkFile("file1"));
        assertEquals(expectedOutput, checker.checkFile("file2"));
    }

}