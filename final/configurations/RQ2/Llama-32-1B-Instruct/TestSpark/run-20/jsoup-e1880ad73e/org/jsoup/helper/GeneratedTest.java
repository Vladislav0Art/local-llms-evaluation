package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTest {

    @BeforeEach
    public void setup() {
        String url = "http://example.com";
        Document document = Jsoup.connect(url).get();
        String title = document.title();
        assert not(title.isEmpty());
    }

    @Test
    public void testUrlBuilderAppendKeyVal() {
        URLBuilder urlBuilder = new UrlBuilder("http://example.com");
        Mockito.when(urlBuilder.appendKeyVal(Mockito.any(Connection.KeyVal.class))).thenReturn(key + ": " + value);
        String key = "key";
        String value = "value";
        String expectedResult = "key:value";
        assert not(urlBuilder.appendKeyVal(Mockito.any(Connection.KeyVal.class)).isEmpty());
    }

    @Test
    public void testUrlBuilderAppendKeyValNull() {
        URLBuilder urlBuilder = new UrlBuilder("http://example.com");
        Mockito.when(urlBuilder.appendKeyVal(null, "value")).thenReturn(expectedResult);
        String key = "key";
        String value = "value";
        assert not(urlBuilder.appendKeyVal(Mockito.any(Connection.KeyVal.class), null).isEmpty());
    }

    @Test
    public void testUrlBuilderAppendNonExistentKey() {
        URLBuilder urlBuilder = new UrlBuilder("http://example.com");
        Mockito.when(urlBuilder.appendKeyVal(new Connection.KeyVal("non-existent-key", "value"))).thenReturn(expectedResult);
        String key = "key";
        String value = "value";
        assert not(urlBuilder.appendKeyVal(Mockito.any(Connection.KeyVal.class), "non-existent-key").isEmpty());
    }

    @Test
    public void testUrlBuilderAppendNullValue() {
        URLBuilder urlBuilder = new UrlBuilder("http://example.com");
        Mockito.when(urlBuilder.appendKeyVal(new Connection.KeyVal("key", null))).thenReturn(expectedResult);
        String key = "key";
        String value = "value";
        assert not(urlBuilder.appendKeyVal(Mockito.any(Connection.KeyVal.class), null).isEmpty());
    }

    @Test
    public void testUrlBuilderAppendEmptyKey() {
        URLBuilder urlBuilder = new UrlBuilder("http://example.com");
        Mockito.when(urlBuilder.appendKeyVal(null, "value")).thenReturn(expectedResult);
        String key = "";
        String value = "value";
        assert not(urlBuilder.appendKeyVal(Mockito.any(Connection.KeyVal.class), null).isEmpty());
    }

    @Test
    public void testUrlBuilderAppendEmptyValue() {
        URLBuilder urlBuilder = new UrlBuilder("http://example.com");
        Mockito.when(urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"))).thenReturn(expectedResult);
        String key = "key";
        String value = "";
        assert not(urlBuilder.appendKeyVal(Mockito.any(Connection.KeyVal.class), null).isEmpty());
    }

    @Test
    public void testUrlBuilderAppendNull() {
        URLBuilder urlBuilder = new UrlBuilder("http://example.com");
        Mockito.when(urlBuilder.appendKeyVal(null, "value")).thenReturn(expectedResult);
        String key = "key";
        String value = "";
        assert not(urlBuilder.appendKeyVal(Mockito.any(Connection.KeyVal.class), null).isEmpty());
    }

    @Test
    public void testUrlBuilderAppendEmpty() {
        URLBuilder urlBuilder = new UrlBuilder("http://example.com");
        Mockito.when(urlBuilder.appendKeyVal(null, "value")).thenReturn(expectedResult);
        String key = "";
        String value = "";
        assert not(urlBuilder.appendKeyVal(Mockito.any(Connection.KeyVal.class), null).isEmpty());
    }

}