package org.jsoup.helper;

public class GeneratedTestAppendKeyValWithEmptyStringAndNull {

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
    public void testAppendKeyValWithEmptyStringAndNull() throws MalformedURLException, URISyntaxException {
        StringBuilder urlBuilder = new StringBuilder();
        Connection.KeyVal kv1 = Connection.KeyVal.of("", "val");
        Connection.KeyVal kv2 = Connection.KeyVal.of(null, "val");
        urlBuilder.appendKeyVal(kv1).appendKeyVal(kv2);
        assert urlBuilder.toString().equals("/?val=val");
    }
}

public class Main {
    public static void main(String[] args) throws MalformedURLException, URISyntaxException {
        org.junit.runner.JUnitCore.main("MainTest");
    }

}