package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;

public class GeneratedRun_EmptyArgs_ThrowsInvalidArgumentException {

    @Test
    public void run_EmptyArgs_ThrowsInvalidArgumentException() {
        EpubChecker checker = new EpubChecker();
        assertThrows(InvalidArgumentException.class, () -> checker.run(new String[0]));
    }

}