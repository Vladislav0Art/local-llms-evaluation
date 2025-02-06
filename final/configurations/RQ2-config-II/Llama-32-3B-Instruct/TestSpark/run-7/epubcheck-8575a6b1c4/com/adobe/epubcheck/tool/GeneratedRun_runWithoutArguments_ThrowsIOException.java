package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class GeneratedRun_runWithoutArguments_ThrowsIOException {

    @Test
    public void run_runWithoutArguments_ThrowsIOException() {
        try {
            new EpubChecker().run(new String[]{});
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
    }

}