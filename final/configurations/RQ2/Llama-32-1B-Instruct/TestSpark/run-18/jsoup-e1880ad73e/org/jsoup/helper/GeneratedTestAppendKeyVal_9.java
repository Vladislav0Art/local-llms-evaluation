package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_9 {

    private static final String INPUT_URL = "https://example.com";

    @Test
    public void testAppendKeyVal_9() {
        String[] kvPairs = {"key1=value1", "key2=value2"};
        KeyVal keyVal = new KeyVal(kvPairs);
        urlBuilder.appendKeyVal(keyVal);
        try (Connection conn = Connection.get(new URL(INPUT_URL))) {
            URI uri = conn.getURI();
            assertNull(uri, "Expected URI to be not null");
        }
    }

}