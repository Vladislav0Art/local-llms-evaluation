package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

public class GeneratedRun_NoArgsTest {

    @Test
    public void run_NoArgsTest() {
        String[] args = {};
        int result = new EpubChecker().run(args);
        assertEquals(0, result);
    }

}