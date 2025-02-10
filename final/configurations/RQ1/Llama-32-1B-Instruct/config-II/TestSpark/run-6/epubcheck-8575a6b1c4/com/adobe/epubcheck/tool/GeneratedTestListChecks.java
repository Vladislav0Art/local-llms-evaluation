package com.adobe.epubcheck.tool;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.*;
import java.util.*;

public class GeneratedTestListChecks {

    @Test
    public void testListChecks() {
        EpubCheck e = new EpubCheck();
        List<CheckedFile> files = e.listChecks();
        Assert.assertTrue(files.size() > 0);
        for (CheckedFile file : files) {
            System.out.println(file.getName());
        }
    }

}