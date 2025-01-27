package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.net.URI;
import java.util.HashMap;
import java.util.Locale;

public class GeneratedRun_NullStringArray_ThrowsNullPointerException {

    @Test
    public void run_NullStringArray_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new EpubChecker().run(null));
    }

}