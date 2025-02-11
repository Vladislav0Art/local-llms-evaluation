package org.jsoup.helper;

public class GeneratedTestUtf8Normalization {

    public static String decodeUrl(String encoded) {
        return encoded.replace("%26", "&").replace("%C3%B6", "ö");
    }

    @Test
    public void testUtf8Normalization() {
        String query = "?a=1&b=2%26o=%C3%B6";
        String decodedQuery = decodeUrl(query);
        assertEquals(decodedQuery, "key=value");
    }

    public class Connection {
        public void connect(String url) throws Exception {
            // Connect implementation
        }
    }

}