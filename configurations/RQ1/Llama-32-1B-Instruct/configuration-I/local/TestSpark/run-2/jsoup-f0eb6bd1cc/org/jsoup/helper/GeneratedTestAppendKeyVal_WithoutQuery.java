package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTestAppendKeyVal_WithoutQuery {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String inputUrl = "https://example.com/path/to/resource?query=abc";
        UrlBuilder.url = null;
        Document doc = Jsoup.parse(inputUrl);
        System.out.println(doc.toString());
    }
}

@Test
public void testAppendKeyVal_WithoutQuery() throws UnsupportedEncodingException {
    String url = "https://example.com/path/to/resource";
    UrlBuilder.url = new java.net.URL(url);
    UrlBuilder.appendKeyVal(new java.net.KeyVal("key", "value"));
    Result result = UrlBuilder.build();
    assert result != null;
}

}