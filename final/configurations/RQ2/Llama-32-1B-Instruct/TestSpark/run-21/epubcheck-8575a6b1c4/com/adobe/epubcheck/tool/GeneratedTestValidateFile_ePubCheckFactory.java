package com.adobe.epubcheck.tool;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestValidateFile_ePubCheckFactory {

    @Test
    public void testValidateFile_ePubCheckFactory() {
        String[] args = {"-v", "2.1.0", "-e", "https://example.com/ebook.ept", "-o", "/tmp/ebook.ept"};
        EPUBVersion version = new EPUBVersion("2.1.0");
        EpubCheck check = new EpubChecker();
        check = Mockito.mock(EpubCheckFactory.class);
        check.returnValue = Mockito.mock(EPubCheck.class);
        int result = check.validateFile(args[0], version, null, check);
        assertEquals(3, result);
    }

}