package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTestUrlBuilderAppendEmptyValue {

    @BeforeEach
    public void setup() {
        String url = "http://example.com";
        Document document = Jsoup.connect(url).get();
        String title = document.title();
        assert not(title.isEmpty());
    }

    @Test
    public void testUrlBuilderAppendEmptyValue() {
        URLBuilder urlBuilder = new UrlBuilder("http://example.com");
        Mockito.when(urlBuilder.appendKeyVal(new Connection.KeyVal("key", "value"))).thenReturn(expectedResult);
        String key = "key";
        String value = "";
        assert not(urlBuilder.appendKeyVal(Mockito.any(Connection.KeyVal.class), null).isEmpty());
    }

}