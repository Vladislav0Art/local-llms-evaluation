package com.adobe.epubcheck.tool;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    private Map<String, Object> environmentVariables = System.getenv();
    private String customMessageFileName;
    private boolean useCustomMessageFile;

    public static void main(String[] args) {
        new Test().testSetCustomMessageFile();
    }

}