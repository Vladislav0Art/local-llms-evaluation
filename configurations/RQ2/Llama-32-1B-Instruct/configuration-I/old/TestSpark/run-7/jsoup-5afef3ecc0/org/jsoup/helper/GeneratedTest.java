package org.jsoup.helper;

import org.jsoup.helper.UrlBuilder;

import static org.junit.Assert.*;

public class GeneratedTest {

    public static class Connection {
        public String key;
        public String value;
    }

    @Test
    public void testBuild() {
        // Arrange
        String inputUrl = "http://example.com";

        // Act
        URL url = UrlBuilder.from(inputUrl).build();

        // Assert
        assertEquals(inputUrl, url.toString());
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

    @Test
    public void testAppendKeyValMultipleKeys() {
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