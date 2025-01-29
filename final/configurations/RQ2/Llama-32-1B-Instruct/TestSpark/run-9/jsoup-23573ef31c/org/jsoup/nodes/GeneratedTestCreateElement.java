package org.jsoup.nodes;

import java.util.List;
import java.util.stream.Collectors;

public class GeneratedTestCreateElement {

    private static Document document;

    @Before
    public void setup() {
        document = new Document("http://example.com");
    }

    @Test
    public void testCreateElement() {
        Element element = document.createElement("test-element");
        assertNotNull(element);
        List<String> tags = element.getAllTagNames();
        assertEquals(1, tags.size());
        assertEquals("test-create-element-tag", tags.get(0));
    }

}