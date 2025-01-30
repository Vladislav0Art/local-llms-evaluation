package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GeneratedTest {

    @Test
    public void run_expandedModeWithNonExistingFilePath_return1() {
        String tempFilePath = "/temp/nonexisting.epub";
        String[] args = new String[]{"-mode", "exp", tempFilePath};

        EpubChecker epubChecker = new EpubChecker();
        int actualReturnCode = epubChecker.run(args);

        Assert.assertEquals(1, actualReturnCode);
    }

    @Test
    public void run_xmpMode_return0() throws IOException {
        Path validEpubPath = createValidEpubFile();
        String[] args = new String[]{"-xmp", validEpubPath.toString()};

        EpubChecker epubChecker = new EpubChecker();
        int actualReturnCode = epubChecker.run(args);

        Files.deleteIfExists(validEpubPath);

        Assert.assertEquals(0, actualReturnCode);
    }

    private Path createValidEpubFile() throws IOException {
        var tempFile = File.createTempFile("valid", ".epub");
        tempFile.deleteOnExit();
        Files.writeString(tempFile.toPath(), "valid epub content");
        return tempFile.toPath();
    }

    @Test
    public void run_expandedModeWithNonExistingFilePath_return1() {
        String tempFilePath = "/temp/nonexisting.epub";
        String[] args = new String[]{"--mode", "exp", tempFilePath};

        EpubChecker epubChecker = new EpubChecker();
        int actualReturnCode = epubChecker.run(args);

        Assert.assertEquals(1, actualReturnCode);
    }

    @Test
    public void run_xmpMode_return0() throws IOException {
        Path validEpubPath = createValidEpubFile();
        String[] args = new String[]{"--xmp", validEpubPath.toString()};

        EpubChecker epubChecker = new EpubChecker();
        int actualReturnCode = epubChecker.run(args);

        Files.deleteIfExists(validEpubPath);

        Assert.assertEquals(0, actualReturnCode);
    }

    private Path createValidEpubFile() throws IOException {
        var tempFile = File.createTempFile("valid", ".epub");
        tempFile.deleteOnExit();
        Files.writeString(tempFile.toPath(), "valid epub content");
        return tempFile.toPath();
    }

    @Test
    public void run_xmpMode_return0() throws IOException {
        Path validEpubPath = createValidEpubFile();
        String[] args = new String[]{"--xmp", validEpubPath.toString()};

        EpubChecker epubChecker = new EpubChecker();
        int actualReturnCode = epubChecker.run(args);

        Files.deleteIfExists(validEpubPath);

        Assert.assertEquals(0, actualReturnCode);
    }

    private Path createValidEpubFile() throws IOException {
        File tempFile = File.createTempFile("valid", ".epub");
        tempFile.deleteOnExit();
        Files.write(tempFile.toPath(), "valid epub content".getBytes());
        return Paths.get(tempFile.toURI());
    }

    @Test
    public void run_expandedModeWithNonExistingFilePath_return1() {
        String tempFilePath = "/temp/nonExisting.epub";
        String[] args = new String[]{"--mode", "exp", tempFilePath};
        EpubChecker epubChecker = new EpubChecker();
        int actualReturnCode = epubChecker.run(args);

        Assert.assertEquals(1, actualReturnCode);
    }

    @Test
    public void run_xmpMode_return0() throws IOException {
        File tempEpub = createValidEpubFile();
        String[] args = new String[]{"--xmp", tempEpub.getAbsolutePath()};
        EpubChecker epubChecker = new EpubChecker();
        int actualReturnCode = epubChecker.run(args);
        tempEpub.deleteOnExit();

        Assert.assertEquals(0, actualReturnCode);
    }

    private File createValidEpubFile() throws IOException {
        File tempEpub = File.createTempFile("valid", ".epub");
        Files.write(tempEpub.toPath(), "valid epub content".getBytes(), StandardOpenOption.WRITE);
        return tempEpub;
    }

}