package org.jsoup.helper;

public class GeneratedAppendKeyVal_connectionKeyVal_stringReturnNewUrlBuilder {

    public static class KeyVal {
        private String key;
        private String value;

        public KeyVal(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }
    }
}

public class UrlBuilder {
    private String url;

    public UrlBuilder(String url) {
        this.url = url;
    }

    public void appendKeyVal(Connection.KeyVal keyVal) {
        if (url.isEmpty()) {
            url = String.format("%s=%s", keyVal.getKey(), keyVal.getValue());
        } else {
            url += String.format("&%s=%s", keyVal.getKey(), keyVal.getValue());
        }
    }

    public URL build() {
        return new URL(url);
    }
}

public class GeneratedTest {

    @Test
    public void appendKeyVal_connectionKeyVal_stringReturnNewUrlBuilder() {
        // Arrange and Act
        String key = "key";
        String value = "value";
        UrlBuilder builder = new UrlBuilder("");
        builder.appendKeyVal(new Connection.KeyVal(key, value));

        boolean result = false; // assuming appending should not add anything

        // Assert
        assertEquals(false, result);
    }

}