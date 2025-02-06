package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeneratedRun_RunMethodReturnsCorrectValue {

    @Test
    public void run_RunMethodReturnsCorrectValue() throws Exception {
        String[] args = {"arg1", "arg2"};
        int result = EpubChecker.class.getDeclaredMethod("run", String[].class).invoke(null, (Object) args);
        assertEquals(0, result);
    }

}