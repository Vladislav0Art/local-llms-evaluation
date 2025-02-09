package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

@RunWith(JUnit4.class)
public class GeneratedForms_elementsReturned {

    @Test
    public void forms_elementsReturned() {
        Document document = Document.createShell("https://example.com");
        List<FormElement> forms = document.forms();
        assertTrue(forms.size() > 0);
    }

}