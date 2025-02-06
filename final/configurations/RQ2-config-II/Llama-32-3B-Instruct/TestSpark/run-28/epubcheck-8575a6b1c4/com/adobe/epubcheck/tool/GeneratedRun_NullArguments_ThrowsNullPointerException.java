package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;

public class GeneratedRun_NullArguments_ThrowsNullPointerException {

    @Test
    public void run_NullArguments_ThrowsNullPointerException() {
        EpubCheck check = new EpubCheck();
        assertThrows(NullPointerException.class, () -> check.run(null));
    }

}