package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyVal {

    public static class Connection {
        public String key;
        public String value;
    }

    @Test
    public void testAppendKeyVal() {
        Connection connection1 = new Connection();
        connection1.key = "key1";
        connection1.value = "value1";

        Connection connection2 = new Connection();
        connection2.key = "key2";
        connection2.value = "value2";

        String inputUrl = "http://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        URL parsedUrl = urlBuilder.appendKeyVal(connection1, connection2).build();

        assertEquals(inputUrl, parsedUrl.toString());
    }

}