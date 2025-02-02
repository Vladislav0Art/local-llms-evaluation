package com.adobe.epubcheck.tool;

public class GeneratedTestSetCustomMessageFileFromEnvironment {

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
    public void testSetCustomMessageFileFromEnvironment() {
        // Given environment variable
        System.setProperty(EPUBCHECK_CUSTOM_MESSAGE_FILE, "custom-message-file");

        EpubCheck check = new EpubCheck();
        check.setCustomMessageFileFromEnvironment();

        // Then the custom message file should be set
        assertTrue(check.customMessageFile != null && check.customMessageFile.exists());
    }

}