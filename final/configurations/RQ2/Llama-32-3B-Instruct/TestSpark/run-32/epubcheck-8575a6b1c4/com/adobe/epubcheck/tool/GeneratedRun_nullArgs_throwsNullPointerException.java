package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedRun_nullArgs_throwsNullPointerException {

    public Locale getLocale() {
        return Locale.US;
    }

    @Test
    public void run_nullArgs_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> epubChecker.run(null));
    }

}