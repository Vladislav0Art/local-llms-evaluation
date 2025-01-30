package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class GeneratedRun_xmlMode_return0 {

    @Test
    public void run_xmlMode_return0() throws IOException {
        File tempEpub = createValidEpubFile();
        String[] args = new String[]{"--xml", tempEpub.getAbsolutePath()};
        EpubChecker epubChecker = new EpubChecker();
        int actualReturnCode = epubChecker.run(args);
        tempEpub.deleteOnExit();

        Assert.assertEquals(0, actualReturnCode);
    }

}