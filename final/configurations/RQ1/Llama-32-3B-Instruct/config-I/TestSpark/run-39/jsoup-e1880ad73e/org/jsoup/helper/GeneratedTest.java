package org.jsoup.helper;

public class GeneratedTest {

    public String toString() {
        return "http://example.com";
    }
}

public class Connection {
    public static class KeyVal {
        private String key;
        private String value;

        public void setKey(String key) {
            this.key = key;
        }

        public void setValue(String value) {
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
    private String q;

    public UrlBuilder(URL url) {
        this.q = url.toString();
    }

    public void appendKeyVal(Connection.KeyVal kv) {
        if (kv.getKey() != null && kv.getValue() != null) {
            this.q += "?" + kv.getKey() + "=" + kv.getValue();
        }
    }

    public String getQ() {
        return q;
    }
}

public class Test {

}