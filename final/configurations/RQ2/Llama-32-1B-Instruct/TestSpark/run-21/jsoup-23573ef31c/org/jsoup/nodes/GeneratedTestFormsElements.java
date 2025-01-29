package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestFormsElements {

    private Element doc;

    @BeforeEach
    public void setup() {
        String baseUri = "http://example.com";
        doc = new Document(baseUri);
    }

    @Test
    public void testFormsElements() {
        List<FormElement> forms = doc.forms();
        assertEquals(0, forms.size());
        Mockito.when(doc.forms()).thenReturn(Mockito.mock(List.class));
    }

}