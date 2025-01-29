package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestGetResponseWithHeader {

    public static String jsoup(String url) throws Exception {
        Document doc = Jsoup.connect(url).get();
        return doc.text().trim();
    }

    @Before
    public void setup() throws Exception {
    }

    @Test
    public void testGetResponseWithHeader() throws Exception {
        String response = jsoup("https://example.com?header=Hello%20World");
        assertEquals(200, response.code());
        Element headerElement = response.headers().header("X-Angular-Header");
        assertEquals("Hello World", headerElement.text().trim());
    }

}