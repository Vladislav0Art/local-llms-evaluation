package org.jsoup.nodes;

import java.util.List;
import java.util.stream.Collectors;

public class GeneratedTestHeadElement {

    private static Document document;

    @Before
    public void setup() {
        document = new Document("http://example.com");
    }

    @Test
    public void testHeadElement() {
        Element head = document.head();
        assertNotNull(head);
        List<String> tags = head.getAllTagNames();
        assertEquals(1, tags.size());
        assertEquals("test-head-tag", tags.get(0));
    }

}