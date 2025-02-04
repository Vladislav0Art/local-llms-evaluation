package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestDisplayHelpMessage {

    // ...
}

// MainEpubCheckTest.java

import org.junit.Test;
import static org.junit.Assert .*;

public class MainEpubCheckTest {

    @Test
    public void testDisplayHelpMessage() throws Exception {
        System.out.println(System.getProperty("os.name"));
        String[] args = {"--help"};
        boolean result = MainEpubCheck.main(args);
        assertTrue(result);

        String helpText = "";
        while (System.out.hasNextLine()) {
            helpText += System.out.nextLine() + "\n";
        }

        assertEquals("help_text", helpText, "expected_help_text");
    }

}