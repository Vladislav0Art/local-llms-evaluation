package com.adobe.epubcheck.tool;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.*;
import java.util.*;

public class GeneratedTestGetSetCustomMessageFile {

    @Test
    public void testGetSetCustomMessageFile() {
        EpubCheck e = new EpubCheck();

        Map<String, String> env = System.getenv();
        String customMessageFileName = env.get(EPUBCHECK_CUSTOM_MESSAGE_FILE);
        if (customMessageFileName != null && customMessageFileName.length() > 0) {
            File f = new File(customMessageFileName);
            e.setCustomMessageFile(f.getAbsolutePath());
        }

        try {
            // Test setting from environment
            e.setCustomMessageFileFromEnvironment();
            assert (e.getCustomMessageFile() == null); // Should be null

            // Test getting and setting back to environment
            Map<String, String> envCopy = new HashMap<>(e.getMessages().getMap());
            e.setCustomMessageFile(f.getAbsolutePath());
            System.out.println("Set custom message file successfully: " + e.getCustomMessageFile());

            // Test with unknown argument
            args.add("--unknown-argument");
            result = e.run(args);
            Assert.assertFalse(result);

        } catch (RuntimeException e) {
            Assert.assertTrue(e.getMessage().contains("custom message file not found"));
        }
    }

}