package org.jsoup.helper;

public class GeneratedTestConnectionKeyValNullKey {

    @Test
    public void testConnectionKeyValNullKey() {
        String key = null;
        String value = "val";
        try {
            new Connection.KeyVal(key, value);
            assert false : "Expected exception not thrown";
        } catch (NullPointerException e) {
            // expected
        }
    }

}