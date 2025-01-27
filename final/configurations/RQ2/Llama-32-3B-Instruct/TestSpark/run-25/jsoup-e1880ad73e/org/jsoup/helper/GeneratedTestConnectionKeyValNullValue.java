package org.jsoup.helper;

public class GeneratedTestConnectionKeyValNullValue {

    @Test
    public void testConnectionKeyValNullValue() {
        String key = "key";
        String value = null;
        try {
            new Connection.KeyVal(key, value);
            assert false : "Expected exception not thrown";
        } catch (NullPointerException e) {
            // expected
        }
    }
}

public class ConnectionKeyVal {

    private String key;

    public ConnectionKeyVal(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setValue(String value) {
        this.key = value;
    }

    public boolean hasValue() {
        return !key.isEmpty();
    }

}