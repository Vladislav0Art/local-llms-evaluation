package com.adobe.epubcheck.tool;

import com.adobe.epubcheck.api.EpubCheck;
import com.adobe.epubcheck.api.Report;
import com.adobe.epubcheck.tool.EpubChecker;
import com.adobe.epubcheck.util.EPUBVersion;
import com.adobe.epubcheck.util.FileResourceProvider;
import com.adobe.epubcheck.util.InvalidVersionException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.w3c.epubcheck.util.url.URLUtils;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedValidateGetLocaleTest {

    // A dummy file to pass to the EpubChecker
    File dummyFile = new File("test.epub");

    @Nested
    @DisplayName("Testing 'run' method")
    class RunMethodTests {

        EpubChecker checker = null;

        @BeforeEach
        void setUp() {
            checker = new EpubChecker();
        }

        @Test
        public void validateGetLocaleTest() {
            assertNotNull(checker.getLocale(), "Expected non-null Locale");
        }
    }

}