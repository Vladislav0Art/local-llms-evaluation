package org.jsoup.helper;

import org.junit.Test;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTestUrlBuilderAppendNonExistentKey {

    @BeforeEach
    public void setup() {
        String url = "http://example.com";
        Document document = Jsoup.connect(url).get();
        String title = document.title();
        assert not(title.isEmpty());
    }

    @Test
    public void testUrlBuilderAppendNonExistentKey() {
        URLBuilder urlBuilder = new UrlBuilder("http://example.com");
        Mockito.when(urlBuilder.appendKeyVal(new Connection.KeyVal("non-existent-key", "value"))).thenReturn(expectedResult);
        String key = "key";
        String value = "value";
        assert not(urlBuilder.appendKeyVal(Mockito.any(Connection.KeyVal.class), "non-existent-key").isEmpty());
    }

}