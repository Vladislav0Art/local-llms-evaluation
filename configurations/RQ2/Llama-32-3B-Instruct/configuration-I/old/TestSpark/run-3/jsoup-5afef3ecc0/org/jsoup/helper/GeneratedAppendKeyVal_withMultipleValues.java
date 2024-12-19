package org.jsoup.helper;

public class GeneratedAppendKeyVal_withMultipleValues {

    private UrlBuilder urlBuilder;

    @Before
    public void setUp() {
        urlBuilder = new UrlBuilder(new URL("http://example.com"));
    }

    @Test
    public void appendKeyVal_withMultipleValues() {
        List<Connection.KeyVal> values = Arrays.asList(new Connection.KeyVal("key1", "value1"), new Connection.KeyVal("key2", "value2"));
        urlBuilder.appendKeyVal(values);
    }
}

public class UrlBuilder {

    private URL inputUrl;

    public UrlBuilder(URL inputUrl) {
        this.inputUrl = inputUrl;
    }

    public URL build() {
        // implementation
        return new URL(inputUrl.toString());
    }

    public void appendKeyVal(List<Connection.KeyVal> values) throws UnsupportedEncodingException {
        // implementation
    }
}

public class Connection {

    public static class KeyVal {
        private String key;
        private String value;

        public KeyVal(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            KeyVal keyVal = (KeyVal) o;
            return Objects.equals(key, keyVal.key) && Objects.equals(value, keyVal.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(key, value);
        }
    }

}