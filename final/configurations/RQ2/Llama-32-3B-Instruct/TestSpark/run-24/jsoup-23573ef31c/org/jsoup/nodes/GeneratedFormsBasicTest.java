package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

public class GeneratedFormsBasicTest {

    @Test
    public void formsBasicTest() {
        Document document = new Document("http://example.com");
        List<FormElement> formElements = document.forms();
        org.junit.Assert.assertTrue(formElements.isEmpty());
    }

}