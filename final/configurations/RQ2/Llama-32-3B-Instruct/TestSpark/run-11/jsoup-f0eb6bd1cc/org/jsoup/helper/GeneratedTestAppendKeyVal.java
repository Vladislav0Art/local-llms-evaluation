package org.jsoup.helper;

public class GeneratedTestAppendKeyVal {

    public MalformedURLException(String message) {
        super(message);
    }
}

public class URISyntaxException extends Exception {
    public URISyntaxException(String message) {
        super(message);
    }
}

public class UnsupportedEncodingException extends Exception {
    public UnsupportedEncodingException(String message) {
        super(message);
    }
}

public class Connection {
    public static class KeyVal {
        private String key;
        private String val;

        public KeyVal(String key, String val) {
            this.key = key;
            this.val = val;
        }

        public static KeyVal of(String key, String val) {
            return new KeyVal(key, val);
        }
    }
}

public class MainTest {

    @Test
    public void testAppendKeyVal() throws MalformedURLException, URISyntaxException {
        StringBuilder urlBuilder = new StringBuilder();
        Connection.KeyVal kv = Connection.KeyVal.of("key", "val");
        urlBuilder.appendKeyVal(kv);
        assert urlBuilder.toString().equals("/key/val");
    }

}