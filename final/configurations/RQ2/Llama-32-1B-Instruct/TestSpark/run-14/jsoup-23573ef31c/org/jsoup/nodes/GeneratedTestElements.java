package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestElements {

    private static final String BASE_URI = "https://example.com";

    @Test
    public void testElements() {
        // Arrange
        String uri = BASE_URI + "/example.html";

        // Act
        List<Element> elements = new ArrayList<>();
        for (Element element : document.forms()) {
            elements.add(element);
        }
        Collections.sort(elements, Comparator.comparingInt(a -> a.tagName()));
        assertNotEmpty(elements);

        // Assert
        assertEquals(1, elements.size());
    }

}