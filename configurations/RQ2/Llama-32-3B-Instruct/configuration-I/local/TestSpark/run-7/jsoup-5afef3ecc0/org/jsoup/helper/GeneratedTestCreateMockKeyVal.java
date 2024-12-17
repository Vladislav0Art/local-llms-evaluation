package org.jsoup.helper;

public class GeneratedTestCreateMockKeyVal {

    private StringBuilder sb;

    public UrlBuilder() {
        sb = new StringBuilder();
    }

    public void appendKeyVal(Connection.KeyVal kv) {
        sb.append(kv.getKey()).append("=").append(kv.getValue());
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}

public class Connection {
    public interface KeyVal {
        String getKey();

        String getValue();
    }

    public static class MockKeyVal implements KeyVal {
        private final String key;
        private final String value;

        public MockKeyVal(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String getKey() {
            return key;
        }

        @Override
        public String getValue() {
            return value;
        }
    }

    public static class Builder {
        private StringBuilder sb;

        public Builder() {
            sb = new StringBuilder();
        }

        public void appendKeyVal(Connection.KeyVal kv) {
            sb.append(kv.getKey()).append("=").append(kv.getValue());
        }

        public String toString() {
            return sb.toString();
        }
    }
}

public class TestUrlBuilder {

    @Test
    public void testCreateMockKeyVal() {
        Connection.KeyVal mockKeyVal = Connection.MockKeyVal.builder()
                .key("testKey")
                .value("testValue")
                .build();
        assertNotNull(mockKeyVal);
    }

}