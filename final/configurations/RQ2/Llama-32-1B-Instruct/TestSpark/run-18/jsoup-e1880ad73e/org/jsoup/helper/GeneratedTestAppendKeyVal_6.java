package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_6 {

    private static final String INPUT_URL = "https://example.com";

    @Test
    public void testAppendKeyVal_6() throws UnsupportedEncodingException {
        String[] kvPairs = {"key1=value1", "key2=value2"};
        KeyVal keyVal = new KeyVal(kvPairs);
        urlBuilder.appendKeyVal(keyVal);
        try (Connection conn = Connection.get(new URL(INPUT_URL))) {
        }
    }

}