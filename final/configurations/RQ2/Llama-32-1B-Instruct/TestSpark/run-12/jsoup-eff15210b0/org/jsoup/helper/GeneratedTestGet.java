package org.jsoup.helper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GeneratedTestGet {

    private Document doc;

    @Before
    public void setup() throws Exception {
        String url = "https://example.com";
        try (Document document = Jsoup.connect(url).get()) {
            this.doc = document;
        }
    }

    @Test
    public void testGet() {
        assertEquals("Hello World!", doc.text().trim());
    }

}