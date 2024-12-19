package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;

import static org.junit.Assert.*;

public class GeneratedTestAppendKeyVal_SingleKeyValue {

    public static class Connection {
        public String key;
        public String value;
    }

    @Test
    public void testAppendKeyVal_SingleKeyValue() {
        Connection connection1 = new Connection();
        connection1.key = "key";
        connection1.value = "value";

        String inputUrl = "http://example.com";
        UrlBuilder urlBuilder = new UrlBuilder(inputUrl);

        URL parsedUrl = urlBuilder.appendKeyVal(connection1).build();

        assertEquals(inputUrl, parsedUrl.toString());
    }

}