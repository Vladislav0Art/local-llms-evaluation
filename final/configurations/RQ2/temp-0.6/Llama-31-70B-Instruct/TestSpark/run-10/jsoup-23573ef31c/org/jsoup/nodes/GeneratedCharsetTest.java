package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;

import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedCharsetTest {

    @Test
    public void charsetTest() {
        Document document = new Document("https://www.example.com");
        document.charset(Charset.forName("UTF-8"));
        assertEquals(Charset.forName("UTF-8"), document.charset());
    }

}