package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestValidateFile {

    @Test
    public void testValidateFile() {
        String[] args = {"-v", "2.1.0", "-e", "https://example.com/ebook.ept", "-o", "/tmp/ebook.ept"};
        EPUBVersion version = new EPUBVersion("2.1.0");
        EpubCheck check = new EpubChecker();
        int result = check.validateFile(args[0], version, null, Mockito.mock(EPUBProfile.class));
        assertEquals(3, result);
    }

}