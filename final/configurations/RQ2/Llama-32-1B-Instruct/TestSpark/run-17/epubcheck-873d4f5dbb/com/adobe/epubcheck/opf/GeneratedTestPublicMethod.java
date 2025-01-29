package com.adobe.epubcheck.opf;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class GeneratedTestPublicMethod {

    @Test
    public void testPublicMethod() {
        assertEquals("test", PublicMethods.getPreferredMediaType("test"));
    }
}

class PublicClassExample {
    public static String getPreferredMediaType(String key) {
        return "public";
    }

}