package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedRun throwsExceptionIfPathIsNotProvided {

    @Test
    public void run

    throwsExceptionIfPathIsNotProvided() throws IOException {
        String[] argsArray = {};
        EpubChecker checker = new EpubChecker();
        int result = checker.run(argsArray);
        assertTrue(result != 0);
    }

}