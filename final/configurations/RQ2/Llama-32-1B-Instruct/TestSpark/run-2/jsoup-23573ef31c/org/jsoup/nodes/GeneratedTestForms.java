package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTestForms {

    @Test
    public void testForms() {
        Document document = new Document("https://example.com");
        Element form1 = document.expectForm("testForm");
        Element form2 = document.expectForm("anotherTestForm");
        List<FormElement> forms = document.forms();
        assertEquals(2, forms.size());
        assertEquals(form1, forms.get(0));
        assertEquals(form2, forms.get(1));
    }

}