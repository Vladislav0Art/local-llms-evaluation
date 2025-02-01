package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.InvalidVersionException;
import io.mola.galimatias.GalimatiasParseException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import java.io.File;
import java.io.IOException;

public class GeneratedTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void runRunNoParametersTest() {
        exceptionRule.expect(RuntimeException.class);
        exceptionRule.expectMessage("Some arguments are needed!");

        EpubChecker epubChecker = new EpubChecker();
        epubChecker.run(new String[0]);
    }

    @Test
    public void runListChecksTest() throws IOException {
        EpubChecker epubChecker = new EpubChecker();
        int exitCode = epubChecker.run(new String[]{"-l"});

        assertEquals("Should return value 0", 0, exitCode);
    }

    @Test
    public void runListChecksToOutFileTest() throws IOException {
        EpubChecker epubChecker = new EpubChecker();
        int exitCode = epubChecker.run(new String[]{"-l", "-o"});

        assertEquals("Should return value 123", 123, exitCode);
    }

    @Test
    public void runInvalidArgumentTest() {
        exceptionRule.expect(RuntimeException.class);
        exceptionRule.expectMessage("Invalid argument");

        EpubChecker epubChecker = new EpubChecker();
        epubChecker.run(new String[]{"-invalid"});
    }

    @Test
    public void runNoFileSpecifiedTest() {
        exceptionRule.expect(RuntimeException.class);
        exceptionRule.expectMessage("No file specified");

        EpubChecker epubChecker = new EpubChecker();
        epubChecker.run(new String[]{"-m", "opf"});
    }

    @Test
    public void runFileNotFoundTest() {
        exceptionRule.expect(RuntimeException.class);
        exceptionRule.expectMessage("File not found!");

        EpubChecker epubChecker = new EpubChecker();
        epubChecker.run(new String[]{"/notExist.epub"});
    }

    @Test
    public void runUnsupportedVersionTest() {
        exceptionRule.expect(RuntimeException.class);
        exceptionRule.expectMessage("Unsupported version");

        EpubChecker epubChecker = new EpubChecker();
        epubChecker.run(new String[]{"--v", "5.0", "/test.epub"});
    }

    @Test
    public void runFilePathAsModeRequiredErrorTest() {
        exceptionRule.expect(RuntimeException.class);
        exceptionRule.expectMessage("Some mode is needed!");

        EpubChecker epubChecker = new EpubChecker();
        epubChecker.run(new String[]{"/testFile"});
    }

    @Test
    public void runModeVersionNotSupportedTest() {
        exceptionRule.expect(RuntimeException.class);
        exceptionRule.expectMessage("Mode version not supported!");

        EpubChecker epubChecker = new EpubChecker();
        epubChecker.run(new String[]{"--mode", "nav", "--v", "2.0", "/testFile.epub"});
    }

    @Test
    public void validateFileNonExistentTest() {
        exceptionRule.expect(RuntimeException.class);
        exceptionRule.expectMessage("File not found!");

        EpubChecker epubChecker = new EpubChecker();
        epubChecker.run(new String[]{"-m", "opf", "--v", "2.0", "nonexistentFile.opf"});
    }

    @Test
    public void validateFileUrlExceptionTest() {
        exceptionRule.expect(RuntimeException.class);
        exceptionRule.expectMessage("Invalid URL!");

        EpubChecker epubChecker = new EpubChecker();
        epubChecker.run(new String[]{"-m", "opf", "--v", "2.0", "notAValidURL"});
    }

    @Test
    public void runPrintUsageTest() {
        EpubChecker epubChecker = new EpubChecker();

        String[] args = new String[]{"--help"};
        epubChecker.run(args);
    }

    @Test
    public void runPrintVersionTest() {
        EpubChecker epubChecker = new EpubChecker();
        String[] args = new String[]{"--version"};
        epubChecker.run(args);
    }

}