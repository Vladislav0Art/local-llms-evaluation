package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class GeneratedRun_xmpMode_return0 {

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