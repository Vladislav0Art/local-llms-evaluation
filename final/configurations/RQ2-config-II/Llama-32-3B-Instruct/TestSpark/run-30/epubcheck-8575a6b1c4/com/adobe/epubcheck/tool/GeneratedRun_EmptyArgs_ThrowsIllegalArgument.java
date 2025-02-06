package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;
import java.util.Locale;

public class GeneratedRun_EmptyArgs_ThrowsIllegalArgument {

    @Test
    public void run_EmptyArgs_ThrowsIllegalArgument() {
        EpubChecker checker = new EpubChecker();
        assertThrows(IllegalArgumentException.class, () -> checker.run(new String[0]));
    }

}