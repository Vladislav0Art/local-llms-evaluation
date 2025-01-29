package org.jsoup.helper;

import org.jsoup.helper.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void testBuild() {
        URL url = new URL("https://example.com");
        String actual = UrlBuilder.build().toString();
        String expected = "https://example.com";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAppendKeyVal() throws UnsupportedEncodingException {
        String key = "key";
        String value = "value";
        Mockito.when(Connection.KeyVal.encode(key)).thenReturn(value);

        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        boolean result = urlBuilder.appendKeyVal(new Connection.KeyVal<>(key, value));
        Assert.assertTrue(result);
    }

    @Test
    public void testAppendKeyVal_WithException() throws UnsupportedEncodingException {
        String key = "key";
        String value = "value";
        Mockito.when(Connection.KeyVal.encode(key)).thenReturn(value);

        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        boolean result = urlBuilder.appendKeyVal(new Connection.KeyVal<>(null, value));
        Assert.assertFalse(result);
    }

    @Test
    public void testAppendKeyVal_WithoutException() {
        String key = "key";
        String value = "value";

        UrlBuilder urlBuilder = new UrlBuilder(new URL("https://example.com"));
        boolean result = urlBuilder.appendKeyVal(new Connection.KeyVal<>(key, value));
        Assert.assertTrue(result);
    }

    @Test
    public void testBuild_WithNullInputUrl() {
        String key = "key";
        String value = "value";

        UrlBuilder urlBuilder = new UrlBuilder(null);

        boolean result = urlBuilder.build().toString().equals("null");
        Assert.assertFalse(result);
    }

}