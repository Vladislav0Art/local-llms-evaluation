package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestGetResponseWithNoCharset {

    public static String jsoup(String url) throws Exception {
        Document doc = Jsoup.connect(url).get();
        return doc.text().trim();
    }

    @Before
    public void setup() throws Exception {
    }

    @Test
    public void testGetResponseWithNoCharset() throws Exception {
        String response = jsoup("https://example.com?charset=UTF-8");
        assertEquals(200, response.code());
        Element charsetElement = response.headers().header("Content-Type");
        assertEquals("", charsetElement.text());
    }

}