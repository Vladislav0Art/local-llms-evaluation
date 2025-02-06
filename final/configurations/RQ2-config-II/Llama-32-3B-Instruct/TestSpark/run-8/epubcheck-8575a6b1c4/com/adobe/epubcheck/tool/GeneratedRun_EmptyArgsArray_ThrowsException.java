package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;

public class GeneratedRun_EmptyArgsArray_ThrowsException {

    @Test
    public void run_EmptyArgsArray_ThrowsException() {
        String[] args = {};
        assertThrows(IllegalArgumentException.class, () -> new EpubChecker().run(args));
    }

}