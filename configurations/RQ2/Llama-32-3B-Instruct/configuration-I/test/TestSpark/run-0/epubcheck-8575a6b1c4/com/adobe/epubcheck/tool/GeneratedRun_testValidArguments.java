package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.File;
import java.lang.reflect.Field;

public class GeneratedRun_testValidArguments {

    private EpubChecker epubChecker;

    public void setEpubChecker(EpubChecker epubChecker) {
        this.epubChecker = epubChecker;
    }

    @Test
    public void run_testValidArguments() {
        String[] args = new String[]{"--validate", "--epub-profile=DC";
        int result = epubChecker.run(args);
        assertTrue(result > 0);
	}

    }