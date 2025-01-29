package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTestGet_WithoutParams {

    private Document doc;

    @Before
    public void setup() throws Exception {
        String url = "https://example.com";
        try (Document document = Jsoup.connect(url).get()) {
            this.doc = document;
        }
    }

    @Test
    public void testGet_WithoutParams() {
        assertEquals("Hello World!", doc.text().trim());
    }

}