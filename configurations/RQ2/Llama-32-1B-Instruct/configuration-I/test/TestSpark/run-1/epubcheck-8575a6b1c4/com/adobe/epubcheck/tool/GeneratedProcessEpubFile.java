package com.adobe.epubcheck.tool;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedProcessEpubFile {

    public interface MockEPubChecker {
        int run(String[] args) throws RuntimeException;

        boolean validateFile(String path, EPUBVersion version, Report report) throws RuntimeException;

        String getLocale();
    }

    public class MockEPUBCheckerImpl implements MockEPubChecker {
        @Override
        public int run(String[] args) throws RuntimeException {
            return 0;
        }

        @Override
        public boolean validateFile(String path, EPUBVersion version, Report report) throws RuntimeException {
            return true;
        }

        @Override
        public String getLocale() {
            return null;
        }
    }

    public class MockEpubProfileImpl implements EPUBProfile {
        private static final String NONEXISTENT = "NONEXISTENT";

        @Override
        public boolean isExistent(String name) {
            return false;
        }
    }

    public class MockReportImpl implements Report {
        @Override
        public void write() {
        }

        @Override
        public void deleteFile() {
        }
    }

    @Test
    public void processEpubFile() {
        MockEPUBChecker mockChecker = new MockEPUBCheckerImpl();
        String[] args = {"/path/to/file"};
        EPUBVersion version = EPUBVersion.VERSION_2;
        when(mockChecker.processEpubFile(args)).thenReturn(Runnable.class);
        Runnable runnable = new Runnable() {
            public void run() {
            }
        };
        try {
            epubChecker.processEpubFile(args);
            fail("Expected RuntimeException");
        } catch (RuntimeException e) {
            assertEquals("Invalid argument", e.getMessage());
        }
    }

}