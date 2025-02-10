package org.jsoup.helper;

public class GeneratedAppendKeyVal_emptyKeyValue {

    @Test
    public void appendKeyVal_emptyKeyValue() {
        // key value
        String url = "https://example.com";
        Connection connection = Mockito.mock(Connection.class);
        when(connection.toString()).thenReturn(url);
        UrlBuilder urlBuilder = new UrlBuilder((String) connection);
        KeyVal kv = new KeyVal();
        urlBuilder.appendKeyVal(kv);
    }

}

public class Connection {
    public String toString() throws URISyntaxException, UnsupportedEncodingException {
        return "https://example.com";
    }
}

public class UrlBuilder {

    private String connection;

    public UrlBuilder(String connection) {
        this.connection = connection;
    }

    public String build() throws URISyntaxException, UnsupportedEncodingException {
        return connection;
    }

    public void appendKeyVal(KeyVal kv) {
        // implement your logic here
    }
}

public class KeyVal {

    private HashMap<String, String> map;

    public KeyVal() {
        this.map = new HashMap<>();
    }

    public void put(String key, String value) {
        this.map.put(key, value);
    }

}