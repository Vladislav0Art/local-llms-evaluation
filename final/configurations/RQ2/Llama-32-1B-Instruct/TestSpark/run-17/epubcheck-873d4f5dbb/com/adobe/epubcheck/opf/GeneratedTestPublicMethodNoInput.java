package com.adobe.epubcheck.opf;

public class GeneratedTestPublicMethodNoInput {

    // test 1

    @Test
    public void testPublicMethodNoInput() {
        assertEquals("public", PublicMethods.getPreferredMediaType());
    }
}

class PublicClass {
    private static Map<String, String> map = new HashMap<>();

    public static String getPreferredMediaType(String key) {
        return map.computeIfAbsent(key, k -> "public");
    }

}