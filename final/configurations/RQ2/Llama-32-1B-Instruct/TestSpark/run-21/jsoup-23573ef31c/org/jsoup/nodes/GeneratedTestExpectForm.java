package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestExpectForm {

    private Element doc;

    @BeforeEach
    public void setup() {
        String baseUri = "http://example.com";
        doc = new Document(baseUri);
    }

    @Test
    public void testExpectForm() {
        FormElement form = doc.expectForm("id='myId'");
        assertEquals("id='myId'", form.cssQuery());
        assertEquals("", form.title());
        Mockito.when(doc.documentType()).thenReturn(DocumentType.SELF);
        Mockito.when(form.cssQuery()).thenReturn("someCss");
    }

}