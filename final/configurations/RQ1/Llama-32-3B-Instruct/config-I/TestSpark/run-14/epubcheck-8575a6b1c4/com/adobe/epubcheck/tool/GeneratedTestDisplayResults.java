package com.adobe.epubcheck.tool;

public class GeneratedTestDisplayResults {

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
    public void testDisplayResults() {
        EpubCheck check = new EpubCheck();
        String[] args = {"-p", "path/to/check"};
        check.parseArguments(args);
        check.setCustomMessageFileFromEnvironment();

        // When displayResults is called
        check.displayResults();

        // Then the output should be printed to the console
        assertTrue(System.out.toString().contains("EpubCheck version: 1.0"));
    }

}

// Enum for EpubCheck version
public enum EPUBCHECK_VERSION {
    VERSION_1_0(1),
    VERSION_2_0(2);

    private int value;

    EPUBCHECK_VERSION(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

}