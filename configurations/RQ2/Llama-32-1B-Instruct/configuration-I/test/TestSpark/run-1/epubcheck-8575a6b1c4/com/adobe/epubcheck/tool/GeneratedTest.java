package com.adobe.epubcheck.tool;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    public interface MockEPUBChecker {
        int run(String[] args) throws RuntimeException;

        boolean validateFile(String path, EPUBVersion version, Report report);

        String getLocale();
    }

    public class MockEPUBCheckerImpl implements MockEPUBChecker {
        @Override
        public int run(String[] args) throws RuntimeException {
            return 0;
        }

        @Override
        public boolean validateFile(String path, EPUBVersion version, Report report) {
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

}