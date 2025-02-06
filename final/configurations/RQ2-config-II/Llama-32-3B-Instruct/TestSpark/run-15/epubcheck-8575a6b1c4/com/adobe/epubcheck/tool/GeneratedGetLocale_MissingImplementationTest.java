package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

public class GeneratedGetLocale_MissingImplementationTest {

    @Test
    public void getLocale_MissingImplementationTest() {
        @SuppressWarnings("unchecked")
        EpubChecker instance = (EpubChecker) org.mockito.Mockito.mock(EpubChecker.class);
        assertThrows(UnsupportedOperationException.class, () -> instance.Locale());
    }

}