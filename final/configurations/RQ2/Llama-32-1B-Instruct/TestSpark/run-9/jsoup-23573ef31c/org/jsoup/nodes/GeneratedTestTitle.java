package org.jsoup.nodes;

import java.util.List;
import java.util.stream.Collectors;

public class GeneratedTestTitle {

    private static Document document;

    @Before
    public void setup() {
        document = new Document("http://example.com");
    }

    @Test
    public void testTitle() {
        String title = "Test Title";
        document.title(title);
        assertEquals(title, document.title());
    }

}