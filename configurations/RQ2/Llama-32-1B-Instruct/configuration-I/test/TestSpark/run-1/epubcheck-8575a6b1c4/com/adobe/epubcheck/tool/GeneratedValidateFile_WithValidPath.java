package com.adobe.epubcheck.tool;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedValidateFile_WithValidPath {

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
    public void validateFile_WithValidPath() {
        MockEPUBChecker mockChecker = new MockEPUBCheckerImpl();
        String path = "/path/to/file";
        when(mockChecker.validateFile(path, EPUBVersion.VERSION_1, new MockReportImpl())).thenReturn(true);
        boolean result = epubChecker.validateFile(path, EPUBVersion.VERSION_1, new MockReportImpl());
        assertEquals(true, result);
    }

}