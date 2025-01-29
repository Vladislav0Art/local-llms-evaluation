package org.jsoup.nodes;

import java.util.List;
import java.util.stream.Collectors;

public class GeneratedTestForms {

    private static Document document;

    @Before
    public void setup() {
        document = new Document("http://example.com");
    }

    @Test
    public void testForms() {
        List<FormElement> forms = document.forms();
        assertEquals(0, forms.size());
    }

}