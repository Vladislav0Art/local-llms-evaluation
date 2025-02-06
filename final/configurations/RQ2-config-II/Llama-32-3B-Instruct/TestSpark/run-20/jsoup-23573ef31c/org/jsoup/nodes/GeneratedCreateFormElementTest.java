package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedCreateFormElementTest {

    @Test
    public void createFormElementTest() {
        Document document = new Document("http://example.com");
        List<FormElement> forms = document.forms();
        assertTrue(forms.isEmpty());
    }

}