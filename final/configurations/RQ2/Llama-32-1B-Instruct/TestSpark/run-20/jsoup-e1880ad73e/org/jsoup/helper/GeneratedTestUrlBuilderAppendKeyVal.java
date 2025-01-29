package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTestUrlBuilderAppendKeyVal {

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

}