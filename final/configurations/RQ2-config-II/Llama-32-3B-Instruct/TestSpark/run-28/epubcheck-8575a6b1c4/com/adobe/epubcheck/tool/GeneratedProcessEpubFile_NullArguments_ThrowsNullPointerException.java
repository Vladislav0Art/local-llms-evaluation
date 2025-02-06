package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;

public class GeneratedProcessEpubFile_NullArguments_ThrowsNullPointerException {

    @Test
    public void processEpubFile_NullArguments_ThrowsNullPointerException() {
        EpubChecker epubChecker = new EpubChecker();
        assertThrows(NullPointerException.class, () -> epubChecker.processEpubFile(null));
    }
}

}