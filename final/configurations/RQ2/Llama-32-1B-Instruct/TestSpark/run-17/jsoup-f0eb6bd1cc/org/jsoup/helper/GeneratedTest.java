package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void testBuild() {
        // Arrange
        String inputUrl = "https://example.com/path";
        URL url = build(inputUrl);

        // Act and Assert
        assertEquals(inputUrl, url.toString());
    }

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        Connection.KeyVal kv1 = new Connection.KeyVal("key1", "value1");
        Connection.KeyVal kv2 = new Connection.KeyVal("key2", "value2");

        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
        urlBuilder.appendKeyVal(kv1);
        urlBuilder.appendKeyVal(kv2);

        // Assert
        assertEquals(2, urlBuilder.getKeys().size());
        assertTrue(urlBuilder.getKeys().containsKey("key1"));
        assertTrue(urlBuilder.getKeys().containsKey("key2"));
    }

    @Test
    public void testBuildWithUnsupportedEncoding() {
        // Arrange
        String inputUrl = "https://example.com/path";

        // Act and Assert
        try {
            UrlBuilder.urlBuilder(inputUrl);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedEncodingException e) {
            // Expected
        }
    }

    @Test
    public void testAppendKeyValWithNull() throws UnsupportedEncodingException {
        Connection.KeyVal kv = null;

        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
        urlBuilder.appendKeyVal(kv);

        // Assert
        assertTrue(urlBuilder.getKeys().containsKey(null));
    }

    @Test
    public void testAppendKeyValWithEmptyString() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("", "");

        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
        urlBuilder.appendKeyVal(kv);

        // Assert
        assertEquals(1, urlBuilder.getKeys().size());
    }

    @Test
    public void testAppendKeyValWithEmptyStringAndNull() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("", null);

        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
        urlBuilder.appendKeyVal(kv);

        // Assert
        assertEquals(1, urlBuilder.getKeys().size());
    }

    @Test
    public void testAppendKeyValWithEmptyStringAndNullAndEmptyKey() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("", "");

        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
        urlBuilder.appendKeyVal(kv);

        // Assert
        assertEquals(1, urlBuilder.getKeys().size());
    }

    @Test
    public void testAppendKeyValWithEmptyStringAndNullAndEmptyValue() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("", "");

        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
        urlBuilder.appendKeyVal(kv);

        // Assert
        assertEquals(1, urlBuilder.getKeys().size());
    }

    @Test
    public void testAppendKeyValWithEmptyStringAndNullAndEmptyKeyAndEmptyValue() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("", null);

        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
        urlBuilder.appendKeyVal(kv);

        // Assert
        assertEquals(1, urlBuilder.getKeys().size());
    }

    @Test
    public void testAppendKeyValWithEmptyStringAndNullAndEmptyValueAndEmptyKey() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("", "");

        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
        urlBuilder.appendKeyVal(kv);

        // Assert
        assertEquals(0, urlBuilder.getKeys().size());
    }

    @Test
    public void testAppendKeyValWithNullAndEmptyString() throws UnsupportedEncodingException {
        Connection.KeyVal kv = null;

        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
        urlBuilder.appendKeyVal(kv);

        // Assert
        assertTrue(urlBuilder.getKeys().containsValue(null));
    }

    @Test
    public void testAppendKeyValWithEmptyStringAndNull() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("", null);

        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
        urlBuilder.appendKeyVal(kv);

        // Assert
        assertTrue(urlBuilder.getKeys().containsValue(null));
    }

    @Test
    public void testAppendKeyValWithEmptyStringAndNullAndEmptyValue() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("", "");

        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
        urlBuilder.appendKeyVal(kv);

        // Assert
        assertTrue(urlBuilder.getKeys().containsValue(null));
    }

    @Test
    public void testAppendKeyValWithEmptyStringAndNullAndEmptyValueAndEmptyKey() throws UnsupportedEncodingException {
        Connection.KeyVal kv = new Connection.KeyVal("", "");

        UrlBuilder urlBuilder = new UrlBuilder("https://example.com/path");
        urlBuilder.appendKeyVal(kv);

        // Assert
        assertTrue(urlBuilder.getKeys().containsValue(null));
    }

}