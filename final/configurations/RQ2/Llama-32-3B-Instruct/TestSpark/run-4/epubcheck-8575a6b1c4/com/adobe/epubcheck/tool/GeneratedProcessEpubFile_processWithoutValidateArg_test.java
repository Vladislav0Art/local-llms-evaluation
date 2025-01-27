package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Locale;

public class GeneratedProcessEpubFile_processWithoutValidateArg_test {

    @Test
    public void processEpubFile_processWithoutValidateArg_test() {
        String[] args = {};
        EpubChecker checker = new EpubChecker();
        int result = checker.processEpubFile(args);
        assertFalse(result == 0);
    }
}

public class EpubChecker {

    public static final String DEFAULT_LOCALE = "en_US";

    public Locale getLocale() {
        return Locale.forLanguageTag(DEFAULT_LOCALE);
    }

    public boolean run(String[] args) {
        // implementation
        return true;
    }

    public int validateFile(String path, EPUBVersion version, Report report, Object... args) {
        // implementation
        return 0;
    }

    public int processEpubFile(String[] args) {
        // implementation
        return 0;
    }
}

public class EPUBVersion {
    public static final int EPUB3 = 1;

    public int getValue() {
        return EPUB3;
    }
}

public class Report {
    private String message;

    public void setMassage(String massage) {
        this.message = massage;
    }

    public String getMessage() {
        return this.message;
    }

    public static class DefaultReportImpl implements Report {

        @Override
        public String getMessage() {
            // implementation
            return "Default Report Message";
        }
    }

}