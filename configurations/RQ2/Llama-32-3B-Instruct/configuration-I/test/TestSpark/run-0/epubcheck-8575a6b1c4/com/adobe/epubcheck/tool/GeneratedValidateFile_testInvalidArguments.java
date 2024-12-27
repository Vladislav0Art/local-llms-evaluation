package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.File;
import java.lang.reflect.Field;

public class GeneratedValidateFile_testInvalidArguments {

    private EpubChecker epubChecker;

    public void setEpubChecker(EpubChecker epubChecker) {
        this.epubChecker = epubChecker;
    }

    @Test
    public void validateFile_testInvalidArguments() {
        String path = "test.ebook";
        EPUBVersion version = null;
        Report report = new Report();
        EPUBProfile profile = new EPUBProfile("profile");
        int result = epubChecker.validateFile(path, version, report, profile);
        assertTrue(result == 0);
    }

}