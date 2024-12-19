package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyValEmptyArray {

    public static class Connection {
        public String key;
        public String value;
    }

    @Test
    public void testAppendKeyValEmptyArray() {
        Connection connection1 = new Connection();
        connection1.key = "key";
        connection1.value = "value";

        Connection connection2 = new Connection();

        String inputUrl = "http://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        URL parsedUrl = urlBuilder.appendKeyVal(connection1, connection2).build();

        assertEquals(inputUrl, parsedUrl.toString());
    }

}