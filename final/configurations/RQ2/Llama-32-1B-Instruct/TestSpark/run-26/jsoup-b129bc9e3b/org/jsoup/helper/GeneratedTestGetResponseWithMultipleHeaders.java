package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestGetResponseWithMultipleHeaders {

    public static String jsoup(String url) throws Exception {
        Document doc = Jsoup.connect(url).get();
        return doc.text().trim();
    }

    @Before
    public void setup() throws Exception {
    }

    @Test
    public void testGetResponseWithMultipleHeaders() throws Exception {
        String response = jsoup("https://example.com?headers=Header1,Header2");
        assertEquals(200, response.code());
        Elements headers = response.headers();
        Elements headerElements = headers.elements();
        for (Element header : headerElements) {
            System.out.println(header.text().trim());
        }
    }

}