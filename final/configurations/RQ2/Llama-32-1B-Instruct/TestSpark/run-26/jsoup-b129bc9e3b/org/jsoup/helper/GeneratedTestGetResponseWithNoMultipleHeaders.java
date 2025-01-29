package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestGetResponseWithNoMultipleHeaders {

    public static String jsoup(String url) throws Exception {
        Document doc = Jsoup.connect(url).get();
        return doc.text().trim();
    }

    @Before
    public void setup() throws Exception {
    }

    @Test
    public void testGetResponseWithNoMultipleHeaders() throws Exception {
        String response = jsoup("https://example.com?no-headers");
        assertEquals(200, response.code());
        Elements headers = response.headers();
        // No header elements.
    }

}