package com.adobe.epubcheck.tool;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTest {

    @Before
    public void setup() {
        // No need to set anything up here, just import the classes we need
    }

    @After
    public void tearDown() {
        // Remove test files after testing
    }

    @Test
    public void test_validate_file_valid_version_1_9() {
        String[] args = {"/path/to/file.epub", "1.0", new Report(), EPUBVersion.V1_9};
        EpubChecker checker = new EpubChecker();
        int result = checker.validateFile(args[0], args[1], args[2]);
        assertEquals(EpubCheckResult.PASSED, result);
    }

    @Test
    public void test_validate_file_invalid_profile_1_9() {
        String[] args = {"/path/to/file.epub", "1.0", new Report(), null};
        EpubChecker checker = new EpubChecker();
        int result = checker.validateFile(args[0], args[1], args[2]);
        assertEquals(EpubCheckResult.PASSED, result);
    }

    @Test
    public void test_validate_file_invalid_profile_30() {
        String[] args = {"/path/to/file.epub", "1.0", new Report(), EPUBProfile.EPUB30};
        EpubChecker checker = new EpubChecker();
        int result = checker.validateFile(args[0], args[1], args[2]);
        assertEquals(EpubCheckResult.PASSED, result);
    }

    @Test
    public void test_validate_file_invalid_profile_1_9_EBURULE() {
        String[] args = {"/path/to/file.epub", "1.0", new Report(), null};
        EpubChecker checker = new EpubChecker();
        int result = checker.validateFile(args[0], args[1], args[2]);
        assertEquals(EpubCheckResult.PASSED, result);
    }

    @Test
    public void test_validate_file_invalid_profile_1_9_EBURULE_1() {
        String[] args = {"/path/to/file.epub", "1.0", new Report(), null};
        EpubChecker checker = new EpubChecker();
        int result = checker.validateFile(args[0], args[1], args[2]);
        assertEquals(EpubCheckResult.PASSED, result);
    }

}