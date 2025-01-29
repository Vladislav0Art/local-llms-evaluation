package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_10 {

    private static final String INPUT_URL = "https://example.com";

    @Test
    public void testAppendKeyVal_10() throws UnsupportedEncodingException {
        String[] kvPairs = {"key1=value1", "key2=value2"};
        KeyVal keyVal = new KeyVal(kvPairs);
        urlBuilder.appendKeyVal(keyVal);
        try (Connection conn = Connection.get(new URL(INPUT_URL))) {
        }
    }

}

class KeyVal {
    private String[] keys;

    public KeyVal(String[] keys) {
        this.keys = keys;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KeyVal that = (KeyVal) o;
        return Arrays.equals(keys, that.keys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keys);
    }

}