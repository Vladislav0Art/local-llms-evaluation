package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedForms_ReturnsCorrectFormsElements {

    @Test
    public void forms_ReturnsCorrectFormsElements() {
        String baseUri = "https://example.com";
        Document document = new Document(baseUri);
        List<FormElement> forms = document.forms();
        assertTrue(forms.size() > 0);
    }

}