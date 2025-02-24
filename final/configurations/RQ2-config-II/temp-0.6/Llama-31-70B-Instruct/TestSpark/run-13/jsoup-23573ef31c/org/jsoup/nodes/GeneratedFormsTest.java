package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.parser.DocumentType;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GeneratedFormsTest {

    @Test
    public void formsTest() {
        String baseUri = "https://www.example.com";
        Document document = new Document(baseUri);
        List<FormElement> forms = document.forms();
        assertNotNull(forms);
    }

}