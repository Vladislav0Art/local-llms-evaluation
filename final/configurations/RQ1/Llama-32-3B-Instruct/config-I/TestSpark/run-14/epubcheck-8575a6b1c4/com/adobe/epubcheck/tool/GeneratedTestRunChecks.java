package com.adobe.epubcheck.tool;

public class GeneratedTestRunChecks {

    public static void main(String[] args) {
        EpubCheck check = new EpubCheck();
        check.setCustomMessageFileFromEnvironment();

        check.parseArguments(args);

        if (check.runChecks()) {
            check.displayResults();
        }
    }
}

// Test class for EpubCheck
public class EpubCheckTest {

    @Test
    public void testRunChecks() {
        EpubCheck check = new EpubCheck();
        String[] args = {"-p", "path/to/check"};
        check.parseArguments(args);
        check.setCustomMessageFileFromEnvironment();

        // When runChecks is called
        boolean result = check.runChecks();

        // Then the result should be true
        assertTrue(result);
    }

}