package com.adobe.epubcheck.tool;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.*;
import java.util.*;

public class GeneratedTestCustomMessages {

    @Test
    public void testCustomMessages() {
        EpubCheck e = new EpubCheck();

        // Test setting custom message file from environment
        e.setCustomMessageFileFromEnvironment();
        Map<String, String> envCopy = new HashMap<>(e.getMessages().getMap());
        String fileName = "customMessage.txt";
        if (!fileName.startsWith("-")) {
            e.messages = Files.newInputStream(new File(fileName).toPath(), StandardCharsets.UTF_8);
            e.useCustomMessageFile = true;
        }

        // Test setting custom message file directly
        e.messages = new Properties();
        Map<String, String> envCopy2 = new HashMap<>(e.getMessages().getMap());
        e.messages.putAll(envCopy2);

        System.out.println("Custom messages:");
        for (String fileName : envCopy) {
            if (!fileName.startsWith("-")) {
                System.out.println(fileName);
            }
        }

        // Test with unknown argument
        args.add("--unknown-argument");
        result = e.run(args);
        Assert.assertFalse(result);
    }

}