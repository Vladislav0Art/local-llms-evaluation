package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTestUrlBuilderAppendKeyValNull {

    @BeforeEach
    public void setup() {
        String url = "http://example.com";
        Document document = Jsoup.connect(url).get();
        String title = document.title();
        assert not(title.isEmpty());
    }

    @Test
    public void testUrlBuilderAppendKeyValNull() {
        URLBuilder urlBuilder = new UrlBuilder("http://example.com");
        Mockito.when(urlBuilder.appendKeyVal(null, "value")).thenReturn(expectedResult);
        String key = "key";
        String value = "value";
        assert not(urlBuilder.appendKeyVal(Mockito.any(Connection.KeyVal.class), null).isEmpty());
    }

}