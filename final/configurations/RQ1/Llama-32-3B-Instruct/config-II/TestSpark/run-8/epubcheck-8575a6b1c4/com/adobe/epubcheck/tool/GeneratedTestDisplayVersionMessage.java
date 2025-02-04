package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestDisplayVersionMessage {

    // ...
}

// MainEpubCheckTest.java

import org.junit.Test;
import static org.junit.Assert .*;

public class MainEpubCheckTest {

    @Test
    public void testDisplayVersionMessage() throws Exception {
        System.out.println(System.getProperty("os.name"));
        String[] args = {"--version"};
        boolean result = MainEpubCheck.main(args);
        assertTrue(result);

        String versionText = "";
        while (System.out.hasNextLine()) {
            versionText += System.out.nextLine() + "\n";
        }

        assertEquals("epubcheck_version_text", versionText, "expected_epubcheck_version_text");
    }

}