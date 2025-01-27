package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class GeneratedTestConnectionAppendKeyVal {

    @Test
    public void testConnectionAppendKeyVal() {
        Connection connection = new Connection();
        connection.appendKeyVal(Connection.KeyVal.create("key", "value"));
        assertThrows(NullPointerException.class, () -> new UrlBuilder(null));
    }
}

class UrlBuilder {

    private StringBuilder sb;

    public UrlBuilder() {
        sb = new StringBuilder();
    }

    public void appendKeyVal(Connection.KeyVal kv) {
        sb.append(kv.getKey()).append("=").append(kv.getValue());
    }

    public URI build() {
        return Jsoup.parse(sb.toString(), baseUrl).getUri();
    }

    private static final String baseUrl = "http://example.com/base";
}

class Connection {

    public void appendKeyVal(Connection.KeyVal kv) throws NullPointerException {
        // implementation
    }
}

}