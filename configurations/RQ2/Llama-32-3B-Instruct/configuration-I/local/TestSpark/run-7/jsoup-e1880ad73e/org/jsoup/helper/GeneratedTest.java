package org.jsoup.helper;

public class GeneratedTest {

    private URL url;

    public UrlBuilder(URL url) {
        this.url = url;
    }

    public String build() {
        // Implementation of build method
        return url.toString();
    }

    public void appendKeyVal(Connection.KeyVal kv) {
        // Implementation of appendKeyVal method
        System.out.println(kv.getKey());
    }
}

public class Connection {
    public static class KeyVal {
        private String key;
        private String val;

        public Connection.KeyVal(
        String key, String
        val)

        {
            this.key = key;
            this.val = val;
        }

        public String getKey() {
            return key;
        }
    }
}

public class UrlBuilderTest {

}