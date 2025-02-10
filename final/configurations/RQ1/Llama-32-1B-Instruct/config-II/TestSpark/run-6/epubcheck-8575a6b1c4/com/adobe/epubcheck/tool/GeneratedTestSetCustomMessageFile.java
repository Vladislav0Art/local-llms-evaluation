package com.adobe.epubcheck.tool;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.*;
import java.util.*;

public class GeneratedTestSetCustomMessageFile {

    @Test
    public void testSetCustomMessageFile() {
        EpubCheck e = new EpubCheck();
        Map<String, String> env = System.getenv();
        String customMessageFileName = env.get(EPUBCHECK_CUSTOM_MESSAGE_FILE);
        if (customMessageFileName != null && customMessageFileName.length() > 0) {
            File f = new File(customMessageFileName);
            if (f.exists()) {
                e.setCustomMessageFile(f.getAbsolutePath());
            } else {
                throw new RuntimeException("Invalid path for custom message file");
            }
            // Test with unknown argument
            args.add("--unknown-argument");
            result = e.run(args);
            Assert.assertFalse(result);
        }

        // Test with missing argument
        args.add("--missing-argument");
        try {
            e.setCustomMessageFileFromEnvironment();
            e.run(args); // Should throw exception
        } catch (RuntimeException e) {
            Assert.assertTrue(e.getMessage().contains("custom message file not found"));
        }
    }

}