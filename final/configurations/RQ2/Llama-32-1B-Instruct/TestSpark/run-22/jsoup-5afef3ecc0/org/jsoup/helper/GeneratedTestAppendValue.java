package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTestAppendValue {

    private String inputUrl;

    public UrlBuilder(String url) {
        this.inputUrl = url;
    }

    public String build() {
        return Jsoup.parse(inputUrl).url();
    }

    public void appendKeyVal(java.util.HashMap<String, String> map) {
        for (java.util.Map.Entry<String, String> entry : map.entrySet()) {
            UrlBuilder(urlBuilder = new UrlBuilder("http://localhost:5000/" + inputUrl));
            urlBuilder.appendKeyVal(entry);
        }
    }

    public void appendValue(String value) {
        UrlBuilder(urlBuilder = new UrlBuilder(inputUrl));
        urlBuilder.appendValue(value);
    }
}

public class GeneratedTest {

    @Test
    public void testAppendValue() {
        String value = "Hello, World!";
        UrlBuilder urlBuilder = urlBuilder -> urlBuilder.appendValue(value);
        return urlBuilder.build();
    }

}