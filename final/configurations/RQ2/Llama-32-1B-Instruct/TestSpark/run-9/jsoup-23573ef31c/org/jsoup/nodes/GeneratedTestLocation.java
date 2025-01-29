package org.jsoup.nodes;

import java.util.List;
import java.util.stream.Collectors;

public class GeneratedTestLocation {

    private static Document document;

    @Before
    public void setup() {
        document = new Document("http://example.com");
    }

    @Test
    public void testLocation() {
        assertEquals("http://example.com", document.getLocation());
    }

}