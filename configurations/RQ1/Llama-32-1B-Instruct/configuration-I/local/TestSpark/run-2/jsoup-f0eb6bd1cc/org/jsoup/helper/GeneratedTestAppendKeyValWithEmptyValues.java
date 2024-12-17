package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTestAppendKeyValWithEmptyValues {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String inputUrl = "https://example.com/path/to/resource?query=abc";
        UrlBuilder.url = null;
        Document doc = Jsoup.parse(inputUrl);
        System.out.println(doc.toString());
    }
}

@Test
public void testAppendKeyValWithEmptyValues() throws UnsupportedEncodingException {
    String url = "https://example.com/path/to/resource?query=abc";
    UrlBuilder.url = new java.net.URL(url);
    try {
        Result result = UrlBuilder.build();
        assert result != null;
        // Ensure path is encoded correctly
        Validate.assertFail(result.toString());
    } catch (UnsupportedEncodingException e) {
        assert false;
    }

}