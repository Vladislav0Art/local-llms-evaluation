package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTestAppendKeyValWithoutQuery {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String inputUrl = "https://example.com/path/to/resource?query=abc";
        UrlBuilder.url = null;
        Document doc = Jsoup.parse(inputUrl);
        System.out.println(doc.toString());
    }
}

@Test
public void testAppendKeyValWithoutQuery() throws UnsupportedEncodingException {
    String url = "";
    UrlBuilder.url = new java.net.URL(url);
    try {
        Result result = UrlBuilder.build();
        assert result == null;
    } catch (UnsupportedEncodingException e) {
        // expected behavior when URL is empty string
    }
}

}