package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedValidateFile Test2 {

    @Test
    public void validateFile

    Test2() throws Exception {
        File path = new File("test.epub");
        EpubChecker instance = new EpubChecker();
        int result = instance.validateFile(path.toURI(), EPUBVersion.VERSION_30, null, null);
        assertEquals(1, result);
    }
}

}