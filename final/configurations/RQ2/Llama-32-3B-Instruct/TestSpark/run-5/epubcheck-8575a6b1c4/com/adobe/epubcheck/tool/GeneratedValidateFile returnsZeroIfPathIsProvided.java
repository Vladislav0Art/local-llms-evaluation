package com.adobe.epubcheck.tool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedValidateFile returnsZeroIfPathIsProvided {

    @Test
    public void validateFile

    returnsZeroIfPathIsProvided() {
        Map<String, Object> map = new HashMap<>();
        map.put("key1", "value1");
        String path = "/path/to/file";
        EpubChecker checker = new EpubChecker();
        int result = checker.validateFile(path, EPUBVersion.V3, null, null);
        assertEquals(0, result);
    }

}