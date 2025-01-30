package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.tool.EpubChecker;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class GeneratedRun_expandedModeWithNonExistingFilePath_return1 {

    @Test
    public void run_expandedModeWithNonExistingFilePath_return1() {
        String tempFilePath = "/temp/nonExisting.epub";
        String[] args = new String[]{"--mode", "exp", tempFilePath};
        EpubChecker epubChecker = new EpubChecker();
        int actualReturnCode = epubChecker.run(args);

        Assert.assertEquals(1, actualReturnCode);
    }

}