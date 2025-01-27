package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

public class GeneratedValidateFile_NullPath_ThrowsNullPointerException {

    @Test
    public void validateFile_NullPath_ThrowsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new EpubChecker().validateFile(null, EPUBVersion.V3, null, null));
    }
}

class EPUBVersion {
    private static final String V3 = "v3";

    public static String getV3() {
        return V3;
    }

}