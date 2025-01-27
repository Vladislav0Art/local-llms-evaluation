package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTestPostRequest {

    @Test
    public void testPostRequest() throws Exception {
        Document document = Jsoup.connect("http://www.example.com")
                .post("Hello, world!", "application/json");
        assertEquals(200, document.statusCode());
    }
}

public class JsoupHelper {
    public static Document connect(String url) {
        return Jsoup.connect(url).get();
    }

    public static Document connectPostData(String url, String data) {
        return Jsoup.connect(url)
                .header("Content-Type", "application/json")
                .post(data);
    }

}