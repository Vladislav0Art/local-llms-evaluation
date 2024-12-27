package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.File;
import java.lang.reflect.Field;

public class GeneratedRun_testInvalidArguments {

    private EpubChecker epubChecker;

    public void setEpubChecker(EpubChecker epubChecker) {
        this.epubChecker = epubChecker;
    }

    @Test
    public void run_testInvalidArguments() {
        String[] args = new String[]{};
        try {
            epubChecker.run(args);
            fail("Expected exception not thrown");
        } catch (Exception e) {
        }
    }

}