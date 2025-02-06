package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class GeneratedRun_runWithInvalidArguments_ThrowsIllegalArgumentException {

    @Test
    public void run_runWithInvalidArguments_ThrowsIllegalArgumentException() {
        try {
            new EpubChecker().run(new String[]{"invalid", "argument"});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

}