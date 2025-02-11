package org.jsoup.helper;

public class GeneratedTestConnectionSerialiseRequestUrl {

    private String key;
    private String value;

    public static KeyVal create(String key, String value) {
        return new KeyVal(key, value);
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}

public class Connection {
    public static boolean needsMultipart(Connection.Request req) {
        // implementation
        return false; // placeholder for now
    }

    public static void serialiseRequestUrl(Connection.Request req) {
        // implementation
    }

    public static class Request {
        private Map<String, String> params = new HashMap<>();

        public void addParam(String key, String value) {
            this.params.put(key, value);
        }

        public boolean needsMultipart() {
            return false; // placeholder for now
        }
    }
}

public class ConnectionTest {

    @Test
    public void testConnectionSerialiseRequestUrl() {
        Connection.Request req = new Connection.Request();
        req.addParam("key1", "value1");
        Connection.serialiseRequestUrl(req);
    }

}