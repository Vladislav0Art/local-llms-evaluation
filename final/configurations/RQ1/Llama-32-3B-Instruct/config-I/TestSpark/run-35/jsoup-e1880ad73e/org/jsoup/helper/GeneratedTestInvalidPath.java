package org.jsoup.helper;

public class GeneratedTestInvalidPath {

    public static String decodeUrl(String encoded) {
        return encoded.replace("%26", "&").replace("%C3%B6", "ö");
    }

    @Test
    public void testInvalidPath() {
        try {
            new Connection().connect("http://example.com/invalid-path");
            assert false;
        } catch (Exception e) {
            // Expected exception
        }
    }
}

}