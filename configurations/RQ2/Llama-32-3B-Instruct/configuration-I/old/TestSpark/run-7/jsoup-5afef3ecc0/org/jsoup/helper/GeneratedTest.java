package org.jsoup.helper;

public class GeneratedTest {

    private StringBuilder sb;

    public UrlBuilder() {
    }

    public void appendKeyVal(Connection.KeyVal kv) {
        if (sb != null) {
            sb.append(kv.getKey()).append("=").append(kv.getValue());
        } else {
            throw new RuntimeException("Url builder is not initialized.");
        }
    }

    @Override
    public String toString() {
        return sb.toString();
    }

    public static UrlBuilder createUrlBuilder() {
        return new UrlBuilder();
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

        public UrlBuilder buildUrlBuilder() {
            return new UrlBuilder();
        }
    }
}

public class TestUrlBuilder {

}