package org.jsoup.helper;

public class GeneratedTestUrlBuildingWithKeyAndValue {

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

    public static URI buildUri(String uri, KeyVal kv) throws URISyntaxException {
        // Implementation of buildUri
        return null; // Replace with implementation
    }

    public static class ConnectionUtil {
        public static Connection.KeyVal createKeyVal(String key, String value) {
            return new Connection.KeyVal(key, value);
        }
    }
}

public class UriBuilderTest {
    private Connection.Connection connection;

    @BeforeAll
    public void setup() throws URISyntaxException, Exception {
        this.connection = Connection.Connection.createConnection();
    }

    @Test
    public void testUrlBuildingWithKeyAndValue() throws URISyntaxException, Exception {
        String uri = "http://localhost:8080/resource";
        Connection.KeyVal kv = Connection.ConnectionUtil.createKeyVal("key", "value");

        URI result = Connection.Connection.buildUri(uri, kv);

        assertEquals("http", result.getScheme());
        assertEquals("localhost:8080/resource?key=value", result.toString());
    }

}