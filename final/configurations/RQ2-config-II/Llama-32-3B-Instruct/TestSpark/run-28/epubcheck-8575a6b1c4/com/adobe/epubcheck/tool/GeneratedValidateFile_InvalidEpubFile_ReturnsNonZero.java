package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.HashMap;

public class GeneratedValidateFile_InvalidEpubFile_ReturnsNonZero {

    @Test
    public void validateFile_InvalidEpubFile_ReturnsNonZero() {
        EpubCheck check = new EpubCheck();
        int result = check.validateFile(new File("invalid.epub").getPath(), EPUBVersion.EPUB30);
        assertNotEquals(0, result);
    }
}

}