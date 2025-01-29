package org.jsoup.nodes;

import java.util.List;
import java.util.stream.Collectors;

public class GeneratedTestBodyElement {

    private static Document document;

    @Before
    public void setup() {
        document = new Document("http://example.com");
    }

    @Test
    public void testBodyElement() {
        Element body = document.body();
        assertNotNull(body);
        List<String> tags = body.getAllTagNames();
        assertEquals(1, tags.size());
        assertEquals("test-body-tag", tags.get(0));
    }

}