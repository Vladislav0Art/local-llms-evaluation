package org.jsoup.helper;

public class GeneratedTestPublicMethod {

    public static String decodeUrl(String encoded) {
        return encoded.replace("%26", "&").replace("%C3%B6", "ö");
    }

    @Test
    public void testPublicMethod() {
        String query = "key=value";
        assertEquals("?key=value", query);
    }

}