package com.adobe.epubcheck.tool;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.*;
import java.util.*;

public class GeneratedTestDisplayHelp {

    @Test
    public void testDisplayHelp() {
        EpubCheck e = new EpubCheck();
        e.setCustomMessageFileFromEnvironment();
        List<String> args = Arrays.asList("help", "--version");
        boolean result = e.run(args);
        Assert.assertTrue(result);
    }

}