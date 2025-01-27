package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.Test;

public class GeneratedConnect_url_isNotNullTest {

    @Test
    public void connect_url_isNotNullTest() {
        String url = "http://example.com";
        Document doc = Jsoup.connect(url).get();
        assert doc != null;
    }

}