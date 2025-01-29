package org.jsoup.nodes;

import java.util.List;
import java.util.stream.Collectors;

public class GeneratedTestText {

    private static Document document;

    @Before
    public void setup() {
        document = new Document("http://example.com");
    }

    @Test
    public void testText() {
        String text = "Hello World!";
        document.text(text);
        assertEquals(text, document.text());
    }

}