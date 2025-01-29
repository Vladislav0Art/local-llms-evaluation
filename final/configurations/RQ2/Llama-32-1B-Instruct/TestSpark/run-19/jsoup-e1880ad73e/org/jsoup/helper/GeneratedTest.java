package org.jsoup.helper;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void testBuild() {
        String inputUrl = "https://example.com/path?param1=value1&param2=value2";
        URLBuilder builder = new UrlBuilder(inputUrl);
        URL url = builder.build();
        assertEquals("https://example.com/path?param1=value1&param2=value2", url.toString());
    }

    @Test
    public void testBuild_withQueryParams() {
        String inputUrl = "https://example.com/path?param1=value1&param2=value2";
        URLBuilder builder = new UrlBuilder(inputUrl);
        Collection<UrlValue> queryParams = builder.appendKeyVal(new UrlValue("key1", "value1"));
        Collection<UrlValue> queryParams2 = builder.appendKeyVal(new UrlValue("key2", "value2"));
        Collection<UrlValue> allQueryParams = builder.appendKeyVal(queryParams);
        Collection<UrlValue> queryParams3 = builder.appendKeyVal(new UrlValue("key3", "value3"));
        Collection<UrlValue> queryParams4 = builder.appendKeyVal(new UrlValue("key4", "value4"));

        String expectedString = "?param1=value1&param2=value2&key1=value1&key2=value2&key3=value3&key4=value4";
        assertEquals(expectedString, urls()[0].toString());

        URLBuilder builder2 = new UrlBuilder(inputUrl);
        Collection<UrlValue> queryParams5 = builder2.appendKeyVal(new UrlValue("key5", "value5"));
        Collection<UrlValue> queryParams6 = builder2.appendKeyVal(new UrlValue("key6", "value6"));

        String expectedString2 = "?param1=value1&param2=value2&key1=value1&key2=value2&key3=value3&key4=value4&key5=value5&key6=value6";
        assertEquals(expectedString2, urls()[1].toString());
    }

    @Test
    public void testAppendKeyVal() {
        UrlValue kv = new UrlValue("key", "value");
        String inputUrl = "https://example.com/path?param1=value1";

        // setup and assert
        when(kv.getKey()).thenReturn("key");
        when(kv.getValue()).thenReturn("value");
        URLBuilder builder = new UrlBuilder(inputUrl);
        Collection<UrlValue> queryParams = builder.appendKeyVal(kv);

        assertEquals("https://example.com/path?param1=value1", urls()[0].toString());
    }

}